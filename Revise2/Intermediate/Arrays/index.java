package Arrays;

import java.util.Arrays;

public class index {

  public static int[] querySum(int A[], int B[][]) {
    // brute force:
    /**
     * int ans[] = new int[B.length];
     * for (int i = 0; i < B.length; i++) {
     * int left = B[i][0];
     * int right = B[i][1];
     * int leftSum = 0;
     * for (int j = 0; j <= left - 1; j++) {
     * leftSum += A[j];
     * }
     * System.out.println(leftSum);
     * int rightSum = 0;
     * for (int j = 0; j <= right; j++) {
     * rightSum += A[j];
     * }
     * ans[i] = rightSum - leftSum;
     * 
     * }
     * return ans;
     */
    // Time Complexity:O(M*N) And Space Complexity:O(1).

    // Optimised Approach:create the prefix sum

    int ans[] = new int[B.length];
    int n = A.length;
    int pf[] = new int[n];
    pf[0] = A[0];
    for (int i = 1; i < A.length; i++) {
      pf[i] = pf[i - 1] + A[i];
    }
    System.out.println(Arrays.toString(pf));
    for (int i = 0; i < B.length; i++) {
      int left = B[i][0];
      int right = B[i][1];
      ans[i] = left != 0 ? pf[right] - pf[left - 1] : pf[right];
    }
    return ans;
  }

  public static int countSpecailIndex(int A[]) {
    int count = 0;
    int pfe[] = new int[A.length];
    pfe[0] = A[0];
    for (int i = 1; i < A.length; i++) {
      if (i % 2 == 0) {
        pfe[i] = pfe[i - 1] + A[i];
      } else {
        pfe[i] = pfe[i - 1];
      }
    }
    // System.out.println(Arrays.toString(pfe));
    int pfo[] = new int[A.length];
    pfo[1] = A[1];
    for (int i = 1; i < A.length; i++) {
      if (i % 2 != 0) {
        pfo[i] = pfo[i - 1] + A[i];
      } else {
        pfo[i] = pfo[i - 1];
      }
    }
    for (int i = 0; i < A.length; i++) {
      int evenSum = 0;
      int oddSum = 0;
      if (i == 0) {
        evenSum = pfo[A.length - 1] - pfo[i + 1 - 1];
        oddSum = pfe[A.length - 1] - pfe[i + 1 - 1];
      } else {
        evenSum = pfe[i - 1] + pfo[A.length - 1] - pfo[i + 1 - 1];
        oddSum = pfo[i - 1] + pfe[A.length - 1] - pfe[i + 1 - 1];
      }
      if (evenSum == oddSum)
        count++;
    }
    return count;
  }

  public static int equlibrium(int A[]) {
    for (int i = 0; i < A.length; i++) {
      int lower = 0;
      for (int j = 0; j < i; j++) {
        lower += A[j];
      }
      int higher = 0;
      for (int j = i + 1; j < A.length; j++) {
        higher += A[j];
      }
      System.out.println(lower + " " + higher);
    }
    return -1;
  }

  public static void main(String[] args) {
    // int A[] = { 2, 2, 2 };
    // int B[][] = { { 0, 0 }, { 1, 2 } };
    // int ans[] = querySum(A, B);
    // System.out.println(Arrays.toString(ans));
    // int A[] = { 1, 1, 1 };
    // System.out.println(countSpecailIndex(A));
    int A[] = { -7, 1, 5, 2, -4, 3, 0 };
    System.out.println(equlibrium(A));
  }
}
