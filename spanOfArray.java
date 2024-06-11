public class spanOfArray {
  // Find the maximum and minimum difference
  // Analysis: Time Complexity O(N) And Space Complexity O(1).
  public static int maxMinArray(int A[]) {
    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < A.length; i++) {
      min = Math.min(max, A[i]);
      max = Math.max(max, A[i]);
    }
    System.out
        .print(
            "Maximum value of the given Array is " + max + " ANd Minimum value of the given Array is " + min + ".\n");
    return max - min;
  }

  // find the second largest element of given array.
  /**
   * Problem Constraints
   * 1 <= N <= 10^5
   * 1 <= A[i] <= 10^9
   */

  // Algorithm:
  /**
   * firstly find the largest element in the given arrays
   * then take secMax=-1; iterate over the array from 0 to n-1.
   * if the A[i] <max then secMax=max(secMax,A[i]).
   */
  public static int secMaximum(int A[]) {
    int max = -1;
    for (int val : A) {
      max = Math.max(val, max);
    }
    int ans = -1;
    for (int i = 0; i < A.length; i++) {
      if (A[i] < max) {
        ans = Math.max(ans, A[i]);
      }
    }
    return ans;
  }
}
