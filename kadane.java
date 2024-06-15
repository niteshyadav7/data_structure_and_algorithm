public class kadane {
  // Algorithm :
  /**
   * Application : it is used for calculating the maximum subarray sum
   * 
   * so the algo is: agar +ve hoga to next add kre ge warna hm usme
   * sum=0; kar ke solve kare ge
   * Analogy : agar apke pass koi gf hai to -> break-up tab tak nahi hoga jab tak
   * hm negative me n ho.
   */
  public static int maxSubArraySumOP(int A[]) {
    int sum = 0;
    int ans = Integer.MIN_VALUE;
    for (int i = 0; i < A.length; i++) {
      sum += A[i];
      ans = Math.max(ans, A[i]);
      if (sum < 0)
        sum = 0;
    }
    return ans;
  }
}
