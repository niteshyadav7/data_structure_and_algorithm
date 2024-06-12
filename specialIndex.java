import java.util.Arrays;

public class specialIndex {
  /**
   * Problem Description
   * Given an array, arr[] of size N, the task is to find the count of array
   * indices such that removing an element from these indices makes the sum of
   * even-indexed and odd-indexed array elements equal.
   */
  // Algorithm :
  /**
   * firstly create the odd and even prefix sum
   * let i-th element removed then before i-th odd remains odd vice-versa for even
   * But after removal the odd became even and even became odd
   */

  public static boolean checkSpecialIdx(int A[]) {
    int pfe[] = new int[A.length];
    int pfo[] = new int[A.length];
    pfe[0] = A[0];
    // here we create the prefix sum of even array
    for (int i = 1; i < A.length; i++) {
      if (i % 2 == 0) {
        pfe[i] = pfe[i - 1] + A[i];
      } else {
        pfe[i] = pfe[i - 1];
      }
    }

    // here we created the prefix sum of odd arrays
    pfo[0] = 0;
    for (int i = 1; i < A.length; i++) {
      if (i % 2 != 0) {
        pfo[i] = pfo[i - 1] + A[i];
      } else {
        pfo[i] = pfo[i - 1];
      }
    }
    System.out.println("Odd Prefix Sum" + Arrays.toString(pfo));
    System.out.println("Even Prefix Sum" + Arrays.toString(pfe));
    for (int i = 0; i < A.length; i++) {
      int evenSum = 0;
      int oddSum = 0;
      if (i == 0) {
        evenSum = pfo[A.length-1] - pfo[i];
        oddSum = pfe[A.length-1] - pfe[i];
      } else {
        evenSum = pfe[i - 1] + pfo[A.length-1] - pfo[i];
        oddSum = pfo[i - 1] + pfe[A.length-1] - pfe[i];
      }
      if(evenSum==oddSum)return true;
    }
    return false;
  }

}
