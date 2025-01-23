import java.util.HashMap;

public class Solution {

  public static void printInc(int A) {
    if (A == 0)
      return;
    printInc(A - 1);
    System.out.println(A);
  }

  public static void printDec(int A) {
    if (A == 0)
      return;
    System.out.println(A);
    printDec(A - 1);
  }

  public static void printDecInc(int A) {
    if (A == 0)
      return;
    System.out.println(A);
    printDecInc(A - 1);
    System.out.println(A);
  }

  public static int factorial(int A) {
    if (A <= 1) {
      return 1;
    }
    int ans = factorial(A - 1);
    return A * ans;
  }

  public static int power(int x, int n) {
    if (n == 0)
      return 1;
    int power = (int) (Math.pow(x, n - 1));
    int ans = power * x;
    return ans;
  }

  public static HashMap<Integer, Integer> freq(int A[]) {
    HashMap<Integer, Integer> hm = new HashMap<>();
    for (int val : A) {
      if (hm.containsKey(val)) {
        hm.put(val, hm.get(val) + 1);
      } else
        hm.put(val, 1);
    }
    return hm;
  }

  public static void main(String[] args) {
    /**
     * HashMap<String, Integer> hm = new HashMap<>();
     * hm.put("Apple", 100);
     * hm.put("Orange", 55);
     * hm.put("Banana", 122);
     * for (String key : hm.keySet()) {
     * System.out.println(key);
     * }
     * for (int val : hm.values()) {
     * System.out.println(val);
     * }
     */
    int arr[] = { 2, 6, 3, 8, 2, 8, 2, 3, 8, 10, 6 };
    System.out.println(freq(arr));
  }
}