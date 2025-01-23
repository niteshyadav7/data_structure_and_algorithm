public class Array {

  public static void printAnti(int A[][]) {
    for (int i = 0; i < A[0].length; i++) {
      int x = 0, y = i;
      while (x < A.length && y >= 0) {
        System.out.print(A[x][y]);
        x++;
        y--;
      }
      System.out.println();
    }
    for (int i = 1; i < A.length; i++) {
      int x = i;
      int y = A.length - 1;
      while (x < A.length && y >= 0) {
        System.out.print(A[x][y]);
        x++;
        y--;
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
    printAnti(arr);
  }
}
