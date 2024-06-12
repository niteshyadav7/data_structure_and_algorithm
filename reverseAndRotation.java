public class reverseAndRotation {
  /**
   * Problem Description
   * Given an array A of N integers and also given two integers B and C. Reverse
   * the elements of the array A within the given inclusive range [B, C].
   * 
   * Problem Constraints
   * 1 <= N <= 10^5
   * 1 <= A[i] <= 10^9
   * 0 <= B <= C <= N - 1
   */

  // Algorithm:
  /**
   * for reverse the array we firtly swap the first element to last element
   * And increase the start index by +1 and decrease the end index by -1.
   * 
   * @param A
   */
  // Analysis : Time complexity:O(N) Space Comlexity:O(1)
  public static void reverse(int A[]) {
    reverseArray(A, 0, A.length - 1);

  }

  public static void reverseArray(int A[], int start, int end) {
    while (start <= end) {
      int temp = A[start];
      A[start] = A[end];
      A[end] = temp;
      start++;
      end--;
    }
  }

  /**
   * Problem Description
   * Given an integer array A of size N and an integer B, you have to return the
   * same array after rotating it B times towards the right.
   */
  public static void rotateArray(int A[], int B) {
    reverse(A);
    reverseArray(A, 0, B - 1);
    reverseArray(A, B, A.length - 1);
  }
}
