public class buy_sell_stocks {
  // Approach I:
  /**
   * first of all find the max
   * then iterate till max index max-A[i] return max from all.
   * 
   * But this approach is fails for hard test cases
   */
  // Approach II::
  /**
   * take max as A[n-1] then iteate form n-2 to 0.
   * check every i-th max means if max found then update the max.
   * 
   */
  public static int maxProfit(int A[]) {
    int max = A[A.length - 1];
    int ans = 0;
    for (int i = A.length - 2; i >= 0; i--) {
      if (A[i] > max)
        max = A[i];

      ans = Math.max(ans, max - A[i]);
    }
    return ans;
  }
}
