public class Sorting {
  // Count sort
  /**
   * Algorithm :
   * step 1: firstly find the maximum elements.
   * step 2: create the arrays of max+1 length with 0.
   * step 3:create the freq array of each elements
   * step 4:then iterate over the array till max. length
   */
  public static int[] countSort(int A[]) {
    // find the maximum arrays
    int max = A[0];
    for (int i = 1; i < A.length; i++) {
      max = Math.max(max, A[i]);
    }
    // now creating the array os max+1 length
    int[] freq = new int[max + 1];
    // creating the array
    for (int i = 0; i < A.length; i++) {
      freq[A[i]]++;
    }
    // now sort
    int k=0;
    for (int i = 0; i <= max; i++) {
      for (int j = 1; j <= freq[i]; j++) {
        A[k]=i;
        k++;
      }
    }
    return A;
  }
}
