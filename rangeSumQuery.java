import java.util.Arrays;

public class rangeSumQuery {
  /**
   * 
   * Problem Description
   * You are given an integer array A of length N.
   * You are also given a 2D integer array B with dimensions M x 2, where each row
   * denotes a [L, R] query.
   * For each query, you have to find the sum of all elements from L to R indices
   * in A (0 - indexed).
   * More formally, find A[L] + A[L + 1] + A[L + 2] +... + A[R - 1] + A[R] for
   * each query.
   * 
   * @return
   * 
   *         A = [1, 2, 3, 4, 5]
   *         B = [[0, 3], [1, 2]]
   */
  /**
   * Problem Constraints
   * 1 <= N, M <= 10^5
   * 1 <= A[i] <= 10^9
   * 0 <= L <= R < N
   */

  // Approach I: BRUTE FORCE:: Time Complexity O(N^2) and Space Complexity O(1).
  // Algorithm:
  /**
   * first find the start and end of index from where to where sum find then store
   * into the ans[]
   * for finding start and end [[1,2],[0,3]]
   * start=A[i][0] and end =A[i][1] and so on..........
   */
  public static int[] bruteApp(int A[], int B[][]) {
    int ans[] = new int[B.length];
    for (int j = 0; j < B.length; j++) {
      int s = B[j][0];
      int e = B[j][1];
      int sum = 0;
      for (int i = s; i <= e; i++) {
        sum += A[i];
      }
      ans[j] = sum;
    }
    return ans;
  }

  // Approach I: optimal solution::Using the prefix sum
  // Time Complexity O(N) And Space Complexity O(N).
  /**
   * create the prefix sum because the finding the sum for the array using the
   * prefix sum is
   * having the time complexity is O(1).i.e constant time .
   * 
   * for this create the prefix sum array then...
   * ex: [1,2,3,4,5] pf[]=[1,3,6,10,15]
   * 
   * Logic :
   * step1: firstly create the prefix array
   * step2: then apply the L And R
   * step3: pf[i]-pf[i-1]=gives the sum
   */

  // Creating the Prefix sum Arrays
  public static int[] prefixSumArray(int A[]) {
    int pf[] = new int[A.length];
    pf[0] = A[0];
    for (int i = 1; i < A.length; i++) {
      pf[i] = pf[i - 1] + A[i];
    }
    return pf;
  }

  // Then find the value
  public static int[] optimalApp(int A[], int B[][]) {

    int ans[] = new int[B.length];
    int pf[] = prefixSumArray(A);
    System.out.println(Arrays.toString(pf));
    for (int i = 0; i < B.length; i++) {
      int L = B[i][0];
      int R = B[i][1];
      // if (L == 0) {
      // ans[i] = pf[R] - 0;
      // } else {
      // ans[i] = pf[R] - pf[L - 1];
      // }
      ans[i] = pf[R] - (L == 0 ? 0 : pf[L - 1]); // used ternary operators
    }
    return ans;
  }
}
