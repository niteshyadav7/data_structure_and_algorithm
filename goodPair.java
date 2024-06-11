public class goodPair {
  /**
   * Problem Description
   * Given an array A and an integer B. A pair(i, j) in the array is a good pair
   * if i != j and (A[i] + A[j] == B). Check if any good pair exist or not.
   * 
   * Problem Constraints
   * 1 <= A.size() <= 10^4
   * 1 <= A[i] <= 10^9
   * 1 <= B <= 10^9
   * 
   */

  // Algorithm:
  /**
   * [1,2,3,4] a[i]+a[j]=7 check (1,2),(1,3),(1,4),(2,3),(2,4),(3,4)
   * target value only exist if (3,4)
   * iterate over the array i=0 to n. then iterate inside the array j=0 to n.
   * 
   * Problem Constraints
   * 1 <= A.size() <= 10^4
   * 1 <= A[i] <= 10^9
   * 1 <= B <= 10^9
   */

  // Analysis : Time complexity:O(N^2) Space Comlexity:O(1)
  public static boolean checkGoodPair(int A[], int B) {
    for (int i = 0; i < A.length; i++) {
      for (int j = i; j < A.length; j++) {
        if (i != j) {
          if (A[i] + A[j] == B)
            return true;
        }
      }
    }
    return false;
  }
}
