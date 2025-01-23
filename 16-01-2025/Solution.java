import java.util.Arrays;

public class Solution {

  public static int maxSubArray(int A[]) {
    int max = Integer.MIN_VALUE;
    /**
     * "BRUTE FORCE O(N^3)"
     * for (int i = 0; i < A.length; i++) {
     * for (int j = i; j < A.length; j++) {
     * int sum = 0;
     * for (int k = i; k < +j; k++) {
     * sum += A[k];
     * }
     * max = Math.max(max, sum);
     * }
     * }
     */

    /**
     * PREFIX SUM O(N^2) O(N)
     * int pf[] = new int[A.length];
     * pf[0] = A[0];
     * for (int i = 1; i < A.length; i++) {
     * pf[i] = pf[i - 1] + A[i];
     * }
     * 
     * for (int i = 0; i < pf.length; i++) {
     * int sum = 0;
     * for (int j = i; j < pf.length; j++) {
     * sum = i == 0 ? pf[j] : pf[j] - pf[i - 1];
     * max=Math.max(max, sum);
     * }
     * }
     */

    /**
     * Contribution technique O(N^2)
     * for (int i = 0; i < A.length; i++) {
     * int sum = 0;
     * for (int j = i; j < A.length; j++) {
     * sum += A[j];
     * max=Math.max(max, sum);
     * }
     * }
     */
    int curr = 0;
    for (int i = 0; i < A.length; i++) {
      curr += A[i];
      max = Math.max(max, curr);
      if (curr < 0) {
        curr = 0;
      }
    }
    return max;
  }

  public static int[] querySum(int A[][]) {
    int ans[] = new int[7];
    for (int i = 0; i < A.length; i++) {
      int idx = A[i][0];
      int val = A[i][1];
      System.out.println(idx + " " + val);
      for (int j = idx; j < ans.length; j++) {
        ans[j] = ans[j] + val;
      }
    }
    return ans;
  }

  public static void main(String[] args) {
    int A[][] = { { 1, 3 }, { 4, -2 }, { 3, 1 } };
    System.out.println(Arrays.toString(querySum(A)));
  }
}