public class min_maxLength {
  /**
   * Problem Description
   * Given an array A, find the size of the smallest subarray such that it
   * contains at least one occurrence of the maximum value of the array
   * and at least one occurrence of the minimum value of the array.
   */
  // Algorith I :
  /**
   * find the min and max
   * then iterate over the array
   * if the arr[i]==min prev_min=i
   * if the arr[i]==max prev_max=i
   * if(min_idx or max_idx==-1)continue
   * else A[i]==min i-max_idx+1
   * A[i]==max i-min_idx+1
   * 
   * @param A
   * @return
   */
  public static int min_max_length(int A[]) {
    int ans = A.length;
    // find the min and max element
    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < A.length; i++) {
      min = Math.min(min, A[i]);
      max = Math.max(max, A[i]);
    }
    System.out.println(min + " " + max);
    // now check the value means find min length
    int min_idx = -1, max_idx = -1;
    for (int i = 0; i < A.length; i++) {
      if (A[i] == min)
        min_idx = i;
      if (A[i] == max)
        max_idx = i;
      if (min_idx == -1 || max_idx == -1)
        continue;
      else {
        if (A[i] == max) {
          ans = Math.min(ans, i - min_idx + 1);
        } else if (A[i] == min) {
          ans = Math.min(ans, i - max_idx + 1);
        }
      }

    }
    return ans;
  }
}
