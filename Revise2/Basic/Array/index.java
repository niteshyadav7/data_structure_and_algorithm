package Array;

import java.util.Scanner;

public class index {

  public static void printArray(int A[]) {
    int size = A.length - 1;
    System.out.print("[");
    for (int i = 0; i < A.length; i++) {
      if (i != size) {
        System.out.print(A[i] + ", ");
      } else {
        System.out.print(A[i]);
      }
    }
    System.out.println("]");
  }

  // print the sum :brute force:
  public static int sumArray(int A[]) {
    int sum = 0;
    int i = 0;
    while (i < A.length) {
      sum += A[i];
      i++;
    }
    return sum;
  }

  // linear search : brute force:
  public static boolean linearSearch(int A[], int x) {
    boolean temp = false;
    for (int i = 0; i < A.length; i++) {
      if (A[i] == x)
        temp = true;
    }
    return temp;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size: ");
    int size = sc.nextInt();
    int arr[] = new int[size];
    for (int i = 0; i < size; i++) {
      System.out.print("Enter element at " + i + "th element: ");
      arr[i] = sc.nextInt();
    }
    printArray(arr);
    int x=12;
    System.out.println(linearSearch(arr, x));
    // int getSum = sumArray(arr);
    // System.out.println(getSum);
  }
}
