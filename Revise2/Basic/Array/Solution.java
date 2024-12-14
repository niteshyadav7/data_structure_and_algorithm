import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

  public static void swap(int A[], int first) {
    int second = first + 1;
    int temp = A[first];
    A[first] = A[second];
    A[second] = temp;
  }

  public static void swapAlternate(int A[]) {
    if (A.length - 1 % 2 == 0) {
      int i = 0;
      while (i < A.length) {
        swap(A, i);
        i += 2;
      }
    } else {
      int i = 0;
      while (i < A.length - 1) {
        swap(A, i);
        i += 2;
      }
    }

  }

  public static int uniqueElement(int A[]) {
    int ans = -1;
    for (int i = 0; i < A.length - 1; i++) {
      boolean temp = true;
      for (int j = i + 1; j < A.length; j++) {
        if (A[i] == A[j]) {
          temp = false;
          break;
        } else
          temp = true;
      }
      if (temp == true) {
        return A[i];
      }
    }
    return ans;
  }

  public static int duplicateElement(int A[]) {
    for (int i = 0; i < A.length; i++) {
      boolean temp = false;
      for (int j = 0; j < A.length; j++) {
        if (i != j) {
          if (A[i] == A[j]) {
            temp = true;
          }
        }
      }
      if (temp)
        return A[i];
    }
    return -1;
  }

  public static ArrayList<Integer> intersectionArray(int A[], int B[]) {
    int n = A.length - 1;
    int m = B.length - 1;
    // int z = Math.max(n, m);
    // int ans[] = new int[z];
    ArrayList<Integer> ans = new ArrayList<>();
    for (int i = 0; i <= n; i++) {
      for (int j = 0; j <= m; j++) {
        if (A[i] == B[j]) {
          // ans[i] = A[i];
          ans.add(A[i]);
          break;
        }
      }
    }
    return ans;
    // List<Integer> intersection = new ArrayList<>();
    // for (int i = 0; i < arr1.length; i++) {
    // for (int j = 0; j < arr2.length; j++) {
    // if (arr1[i] == arr2[j] ) {
    // intersection.add(arr1[i]);
    // break; // Break to avoid duplicate checks for this element
    // }
    // }
    // }
    // return (ArrayList<Integer>) intersection;
  }

  public static int pairSum(int A[], int X) {
    // int ans=0;
    int count = 0;
    for (int i = 0; i < A.length - 1; i++) {
      for (int j = i + 1; j < A.length; j++) {
        if (A[i] == X - A[j])
          count++;
      }
    }
    return count;
  }

  public static void sortZeroAndOne(int A[]) {
    // count 0 & 1:
    int cnt0 = 0;
    for (int i = 0; i < A.length; i++) {
      if (A[i] == 0) {
        cnt0++;
      }
    }
    for (int i = 0; i < cnt0; i++) {
      A[i] = 0;
    }
    for (int i = cnt0 ; i < A.length; i++) {
      A[i] = 1;
    }
  }

  public static void main(String[] args) {
    // int arr[] = { 1, 2, 3, 4, 5, 2 };
    int arr1[] = { 2, 6, 8, 5, 4, 3 };
    int arr2[] = { 2, 3, 4, 7 };
    // int arr[] = { 1, 3, 6, 2, 5, 4, 3, 2, 4 };
    int arr[] = { 0, 0, 1, 1, 0, 0, 1, 0 };
    System.out.println(Arrays.toString(arr));
    sortZeroAndOne(arr);
    System.out.println(Arrays.toString(arr));
    // System.out.println(pairSum(arr, 7));
    // System.out.println(intersectionArray(arr1, arr2));
    // System.out.println(Arrays.toString(arr));
    // System.out.println(Arrays.toString(intersectionArray(arr1, arr2)));

    // intersectionArray(arr, arr);
    // System.out.println(duplicateElement(arr));
    // System.out.println(uniqueElement(arr));
    // swapAlternate(arr);
    // System.out.println(Arrays.toString(arr));
  }
}