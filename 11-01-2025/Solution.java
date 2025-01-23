import java.util.Arrays;

public class Solution {

  public static int[] prefixSum(int A[]) {
    // prefix sum:finding the sum from 0th index to ith index.
    int pf[] = new int[A.length];
    pf[0] = A[0];
    for (int i = 1; i < A.length; i++) {
      pf[i] = pf[i - 1] + A[i];
    }
    return pf;
  }

  public static int[] suffixSum(int A[]) {
    // suffix sum:finding the sum from ith index till last index.
    int n = A.length;
    int sf[] = new int[n];
    sf[n - 1] = A[n - 1];
    for (int i = n - 2; i >= 0; i--) {
      sf[i] = sf[i + 1] + A[i];
    }
    return sf;
  }

  public static int[] querySum(int A[], int B[][]) {
    int pf[] = prefixSum(A);
    int ans[] = new int[B.length];
    for (int i = 0; i < B.length; i++) {
      int L = B[i][0];
      int R = B[i][1];
      ans[i] = L == 0 ? pf[R] : pf[R] - pf[L - 1];
    }
    return ans;
  }

  public static int checkBit(int A, int B) {
    int ans = (A & (1 << B));
    return ans != 0 ? 1 : 0;
  }

  public static int countSetBit(int A) {
    int count = 0;
    for (int i = 0; i < 32; i++) {
      if ((A & (1 << i)) != 0) {
        count++;
      }
    }
    return count;
  }

  public static int findUnique(int A[]) {
    int ans = 0;
    for (int i = 0; i < 32; i++) {
      int cnt = 0;
      for (int j = 0; j < A.length; j++) {
        if ((A[j] & (1 << i)) != 0) {
          cnt++;
        }
      }
      if ((cnt & 1) != 0) {
        ans = ans | (1 << i);
      }
    }
    return ans;
  }

  public static void main(String[] args) {
    // System.out.println(checkBit(45, 2));
    int arr[] = { 2, 3, 5, 6, 3, 6, 2 };
    System.out.println(findUnique(arr));

    // int arr[] = { 2, 4, 6, 8, 10 };
    // System.out.println(Arrays.toString(arr));
    // // int ans[] = prefixSum(arr);
    // int ans[] = suffixSum(arr);
    // System.out.println(Arrays.toString(ans));
    // int A[] = { 2, 2, 2 };
    // int B[][] = { { 0, 0 }, { 1, 2 } };
    // int ans[]=querySum(A, B);
    // System.out.println(Arrays.toString(ans));
    // int mask = 1 << 2;
    // System.out.println(mask);
  }
}
