public class NumberSystem {

  public static int decimalToAny(int A, int B) {
    int ans = 0;
    int p = 1;
    while (A != 0) {
      int rem = A % B;
      ans += rem * p;
      p = p * 10;
      A = A / B;
    }
    return ans;
  }

  public static int AnyToDecimal(int A, int B) {
    int ans = 0;
    int p = 1;
    while (A != 0) {
      int rem = A % 10;
      ans += rem * p;
      p *= B;
      A /= 10;
    }
    return ans;
  }

  public static int sum(int num1, int num2, int B) {
    int ans = 0;
    int carry = 0;
    int p = 1;
    while (num1 != 0 || num2 != 0 || carry > 0) {
      int rem1 = num1 % B;
      int rem2 = num2 % B;
      int rem = rem1 + rem2 + carry;
      carry=rem/B;
     
      rem = rem % B;
      ans += rem * p;
      p *= 10;
      num1 /= 10;
      num2 /= 10;
    }
    return ans;
  }

  public static void main(String[] args) {
    // System.out.println(decimalToAny(694, 2));
    // System.out.println(AnyToDecimal(1172, 8));
    System.out.println(sum(236, 754, 8));
  }
}
