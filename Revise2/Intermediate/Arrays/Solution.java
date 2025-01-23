package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {

  public static int[][] subArray(int A[]) {
    ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
    System.out.println("Hello");
    for (int i = 0; i < A.length; i++) {
      for (int j = i; j < A.length; j++) {
        ArrayList<Integer> curr = new ArrayList<>();
        for (int k = i; k <= j; k++) {
          curr.add(A[k]);
        }
        ans.add(curr);
      }
    }
    return (int[][]) ans.toArray();
    // System.out.println(ans);
    // return new int[2][2];
  }

  public static void leaderArray(int A[]) {
    ArrayList<Integer> ans = new ArrayList<>();
    ans.add(A[A.length - 1]);
    int curr = A[A.length - 1];
    for (int i = A.length - 2; i >= 0; i--) {
      if (curr < A[i]) {
        ans.add(A[i]);
        curr = A[i];
      }
    }
    System.out.println(ans);
  }

  public static int buySell(int A[]) {
    int max_proft = Integer.MIN_VALUE;
    for (int i = 0; i < A.length; i++) {
      int profit = 0;
      for (int j = i + 1; j < A.length; j++) {
        profit = A[j] - A[i];
        if (profit > max_proft)
          max_proft = profit;
      }
    }
    return max_proft;
  }

  public static void main(String[] args) {
    int arr[] = { 1, 4, 5, 2, 4 };
    System.out.println(buySell(arr));
    // leaderArray(arr);
    // System.out.println(Arrays.deepToString(subArray(arr)));
  }

}
