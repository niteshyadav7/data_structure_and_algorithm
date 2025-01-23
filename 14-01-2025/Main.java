public class Main {

  public static int countDigit(int A) {
    int cnt = 0;
    while (A > 0) {
      A = A / 10;
      cnt++;
    }
    // System.out.println(cnt);
    return cnt;
  }

  public static void printRL(int A) {
    int cntDigit = countDigit(A) - 1;
    while (cntDigit >= 0) {
      int pow = (int) (Math.pow(10, cntDigit));
      System.out.println(A / pow);
      A = A % pow;
      cntDigit--;
    }
  }

  public static int reverseNum(int A) {
    int cntDigit = countDigit(A) - 1;
    int ans = 0;
    while (A != 0) {
      int rem = A % 10;
      int pow = (int) (Math.pow(10, cntDigit));
      ans += rem * pow;
      A /= 10;
      cntDigit--;
    }
    return ans;
  }

  public static int inverseNum(int A) {
    int ans = 0;
    int p = 1;
    while (A != 0) {
      int rem = A % 10;
      int pow = (int) (Math.pow(10, rem - 1));
      ans += p * pow;
      p++;
      A /= 10;
    }
    return ans;
  }

  public static void main(String[] args) {
    String str = new String();
  }
}