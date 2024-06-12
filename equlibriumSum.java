import java.util.Arrays;

public class equlibriumSum {
  /**
   * Problem Description
   * You are given an array A of integers of size N.
   * 
   * Your task is to find the equilibrium index of the given array
   * 
   * The equilibrium index of an array is an index such that the sum of elements
   * at lower indexes is equal to the sum of elements at higher indexes.
   * 
   * If there are no elements that are at lower indexes or at higher indexes, then
   * the corresponding sum of elements is considered as 0.
   * 
   * Note:
   * 
   * Array indexing starts from 0.
   * If there is no equilibrium index then return -1.
   * If there are more than one equilibrium indexes then return the minimum index.
   * 
   * A = [-7, 1, 5, 2, -4, 3, 0]
   * Explanation 1:
   * i Sum of elements at lower indexes Sum of elements at higher indexes
   * 0 0 7
   * 1 -7 6
   * 2 -6 1
   * 3 -1 -1
   * 4 1 3
   * 5 -3 0
   * 6 0 0
   * 
   * 3 is an equilibrium index, because:
   * A[0] + A[1] + A[2] = A[4] + A[5] + A[6]
   */
  // Approach I: Brute Force
  /**
   * Equlibrium means if i-th sum till i-1 is lower index sum i+1 to n-1 till.
   */
  public static int equlibriumBrute(int A[]) {
    for (int i = 0; i < A.length; i++) {
      int lowerSum = 0;
      for (int j = 0; j < i; j++) {
        lowerSum += A[j];
      }
      int hSum = 0;
      for (int j = i + 1; j < A.length; j++) {
        hSum += A[j];
      }
      // System.out.println(lowerSum+" "+hSum);
      if (lowerSum == hSum)
        return i;
    }
    return -1;
  }

  // Approach II: Optimal Solution
  /**
   * step 1: find the prefix sum
   * step 2: find the suffix sum
   * step 3: travese over the i-size-1 and check whether the number is equal or
   * not if equal then return
   * its indexes.
   */
  public static int equilibriumOp(int A[]) {
    int pf[] = new int[A.length];
    pf[0] = A[0];
    for (int i = 1; i < A.length; i++) {
      pf[i] = pf[i - 1] + A[i];
    }
    int sf[] = new int[A.length];
    sf[A.length-1] = A[A.length-1];
    for (int i = A.length - 2; i >= 0; i--) {
      sf[i] = sf[i + 1] + A[i];
    }
    System.out.println(Arrays.toString(pf));
    System.out.println(Arrays.toString(sf));
    for(int i=0;i<A.length;i++){
      if(pf[i]==sf[i])return i;
    }
    return 1;
  }
}
