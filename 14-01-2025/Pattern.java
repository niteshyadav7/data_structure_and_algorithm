public class Pattern {

  public static void trianglePrint(int A) {
    // for (int i = 1; i <= A; i++) {
    // // magic
    // for (int j = 1; j <= i; j++) {
    // System.out.print("* ");
    // }
    // System.out.println();
    // }

    // for (int i = A; i >= 1; i--) {
    // // magic
    // for (int j = 1; j <= i; j++) {
    // System.out.print("* ");
    // }
    // System.out.println();
    // }

    // int spc=5-1,str=1;
    // for (int i = 1; i <= 5; i++) {
    // for (int j = 1; j <= spc; j++) {
    // System.out.print(" ");
    // }
    // for(int k=1;k<=str;k++){
    // System.out.print("*");
    // }
    // spc--;
    // str++;
    // System.out.println();
    // }

    // int spcs = 0, str = A;
    // for (int i = 1; i <= A; i++) {
    // for (int j = 1; j <= spcs; j++) {
    // System.out.print(" ");
    // }
    // for (int j = 1; j <= str; j++) {
    // System.out.print("* ");
    // }
    // spcs++;
    // str--;
    // System.out.println();
    // }
    int spaces = A / 2;
    int star = 1;
    for (int i = 1; i <= A; i++) {
      // System.out.println(spaces + " " + star);
      for (int j = 1; j <= spaces; j++) {
        System.out.print(" ");
      }
      for (int j = 1; j <= star; j++) {
        System.out.print("*");
      }
      if (i <= A / 2) {
        spaces--;
        star += 2;
      } else {
        spaces++;
        star -= 2;
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    trianglePrint(5);
  }
}

/**
 * 
 * * * * * *
 * * * * *
 * * * *
 * * *
 * *
 */