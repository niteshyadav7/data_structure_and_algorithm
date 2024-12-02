import java.util.Scanner;

public class Main {

  public static void printNumber(int n) {
    int i = 1;
    while (i <= n) {
      System.out.print(i + " ");
      i++;
    }
  }

  public static void squarePrint(int num) {
    int i = 0;
    while (i < num) {
      int j = 0;
      while (j < num) {
        System.out.print(num + " ");
        j++;
      }
      System.out.println();
      i++;
    }
  }

  public static void trianglePrint(int num) {
    int i = 0;
    int print = 1;
    while (i < num) {
      int j = 0;
      while (j <= i) {
        System.out.print(print);
        j++;
      }
      print++;
      System.out.println();
      i++;
    }
  }

  public static void trianglePrintReverse(int num) {
    int i = 1;
    while (i <= num) {
      int j = 1;
      int print = i;
      while (j <= i) {
        System.out.print(print + " ");
        print--;
        j++;
      }
      System.out.println();
      i++;
    }
  }

  public static void trianglePrintAlp(int num) {
    int print = (char)('A'+num-1);
    int i = 1;
    while (i <= num) {
      int j = 1;
      while (j <= i) {
        System.out.print((char)(print - i + j));
        // System.out.print((char)('A'+i-1));
        // System.out.print((char)('A'+j-1));
        j++;
      }
      System.out.println();
      i++;
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the value : ");
    int num = sc.nextInt();
    trianglePrintAlp(num);
    // trianglePrintReverse(num);
    // trianglePrint(num);
    // squarePrint(num);
    // printNumber(num);
    // System.out.println(num);
  }
}
