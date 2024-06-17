import java.util.ArrayList;

public class multi_dim_array {
  /**
   * Problem Description::
   * 
   * You are given a 2D integer matrix A, return a 1D integer array containing
   * column-wise sums of original matrix.
   */

  // Algorithm ::
  /**
   * so according to question return colm wise sum into the array. A[i][j] when
   * changes
   * when we calculate the row wise sum then only j chamges i.e for i-th =0,
   * A[0][j].
   * when we calculate the col wise sum then only i chamges i.e for j-th =0,
   * A[i][i].
   * 
   * Note : always remember solve for rectangular matrix bze number of rows and
   * cols are different.
   */
  public static int[] colsWiseSum(int A[][]) {
    int lengthRows = A.length, lengthCols = A[0].length;
    int ans[] = new int[lengthCols];// we want to return the cols wise array length should be equal to lengthCols.
    for (int i = 0; i < lengthCols; i++) {
      int sum = 0;
      for (int j = 0; j < lengthRows; j++) {
        sum += A[j][i];
      }
      ans[i] = sum;
    }
    return ans;
  }

  /**
   * Problem Description
   * 
   * You are given a N X N integer matrix. You have to find the sum of all the
   * main diagonal elements of A.
   * Main diagonal of a matrix A is a collection of elements A[i, j] such that i =
   * j.
   */
  // Algorithm :
  /**
   * first of all according to the question : i==j A[i][i].
   */
  public static int mainDiagonalSum(int A[][]) {
    int sum = 0;
    for (int i = 0; i < A.length; i++) {
      sum += A[i][i];
    }
    return sum;
  }

  /**
   * Problem Description
   * Give a N * N square matrix A, return an array of its anti-diagonals. Look at
   * the example for more details.
   */

  public static ArrayList<ArrayList<Integer>> antiDiagonal(int A[][]) {
    ArrayList<ArrayList<Integer>> list = new ArrayList<>();
    // Upper Half
    for (int j = 0; j < A[0].length; j++) {
      int f = 0;
      int l = j;
      ArrayList<Integer> ans = new ArrayList<>();
      while (f < A.length && l >= 0) {
        ans.add(A[f][l]);
        f++;
        l--;
      }
      list.add(ans);
    }
    // Lower Half
    for (int i = 1; i < A.length; i++) {
      int f = i;
      int l = A.length - 2;
      ArrayList<Integer> ans = new ArrayList<>();
      while (f < A.length && l >= 0) {
        ans.add(A[f][l]);
        f++;
        l--;
      }
      list.add(ans);
    }
    return list;
  }

  // Find the transpose of the matrix:
  /**
   * just do one thing iterate
   */
  public static void transpose(int A[][]) {
    for (int i = 0; i < A.length; i++) {
      for (int j = i; j < A[0].length; j++) {
        int temp = A[i][j];
        A[i][j] = A[j][i];
        A[j][i] = temp;
      }
    }
    // Rotate the matrix
    /**
     * firstly transpose the array
     * then reverse the matrix
     */
  }

  public static void rotateArray(int A[][]) {
    // transpose the arrays
    multi_dim_array.transpose(A);
    for (int i = 0; i < A.length; i++) {
      int start = 0;
      int end = A.length - 1;
      while (start <= end) {
        int temp = A[i][start];
        A[i][start] = A[i][end];
        A[i][end] = temp;
        start++;
        end--;
      }
    }
  }
  // Problem 1: check into sorted matrix x exist or not
  // Problem 2: check int row wise matrix 1's and 0's.
  // Problem 3; Print the rectangle of the matrix
  //Algorithm::
  /**
   * first upper part : for this iterate form j=0 to j=N-1
   * for right side part :for this iterate from i=1 to i=N-2
   * for base part :for this iterate from j=N-1 to j=0
   * for side part : for this iterate form i=N-2 to i=1
   */

}
