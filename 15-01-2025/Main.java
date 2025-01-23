import java.util.ArrayList;
import java.util.HashMap;

public class Main {

  public static String toggleStr(String A) {
    StringBuilder str = new StringBuilder();
    for (int i = 0; i < A.length(); i++) {
      if (A.charAt(i) >= 'A' && A.charAt(i) <= 'Z') {
        str.append((char) (A.charAt(i) + 32));
      } else {
        str.append((char) (A.charAt(i) - 32));
      }
    }
    return str.toString();
  }

  public static int longestPS(String str) {
    int ans = 0;
    for (int c = 0; c < str.length(); c++) {
      // for odd
      int left = c;
      int right = c;
      while (left >= 0 && right < str.length()) {
        if (str.charAt(left) != str.charAt(right))
          break;
        left--;
        right++;
      }
      ans = Math.max(ans, right - left - 1);
      left = c;
      right = c + 1;
      while (left >= 0 && right < str.length()) {
        if (str.charAt(left) != str.charAt(right))
          break;
        left--;
        right++;
      }
      ans = Math.max(ans, right - left - 1);
    }
    return ans;
  }

  public static boolean checkAnagram(String A, String B) {
    boolean ans = false;
    for (int i = 0; i < A.length(); i++) {
      char curr = A.charAt(i);
      boolean temp = false;
      for (int j = 0; j < B.length(); j++) {
        if (B.charAt(j) == curr) {
          temp = true;
          break;
        }
      }
      if (temp)
        ans = true;
      else
        return false;
    }

    return ans;
  }

  public static boolean fun(String A, String B) {
    boolean ans = false;
    HashMap<Character, Integer> hm = new HashMap<>();
    for (int i = 0; i < A.length(); i++) {
      if (hm.containsKey(A.charAt(i))) {
        hm.put(A.charAt(i), hm.get(A.charAt(i)) + 1);
      } else {
        hm.put(A.charAt(i), 1);
      }
    }
    for (int i = 0; i < B.length(); i++) {
      if (hm.containsKey(B.charAt(i))) {
        hm.put(B.charAt(i), hm.get(B.charAt(i)) - 1);
      } else if (!hm.containsKey(B.charAt(i))) {
        return false;
      }
    }
    for (var pair : hm.entrySet()) {
      if (pair.getValue() != 0) {
          return false;
      }
  }
    return true;
  }

  public static void main(String[] args) {
    String s1 = "secure";
    String s2 = "rescue";
    System.out.println(fun(s1, s2));
  }
}