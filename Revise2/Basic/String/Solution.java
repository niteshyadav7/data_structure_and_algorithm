import java.util.Stack;

public class Solution {
  // Stack<String> st = new Stack<>();
  // for(int i=0;i<A.length();i++){
  // String word="";
  // while(A.charAt(i)!=' ' && i<A.length()){
  // word+=A.charAt(i);
  // i++;
  // }
  // if(word.equals("")){
  // continue;
  // }
  // st.push(word);
  // }

  public static void reversWord(String A) {

    

  }

  public static void subString(String A) {
    for (int i = 0; i < A.length(); i++) {
      for (int j = i; j < A.length(); j++) {
        for (int k = i; k <= j; k++) {
          System.out.print(A.charAt(k) + " ");
        }
        System.out.println();
      }
    }
  }

  public static boolean checkPalindrome(String A) {
    int s = 0, e = A.length() - 1;
    while (s <= e) {
      if (A.charAt(s) != A.charAt(e)) {
        System.out.println(A.charAt(s) + " " + A.charAt(e));
        return false;

      }
      s++;
      e--;
    }
    return true;

  }

  public static int countWord(String A) {
    if (A.length() <= 0) {
      return 0;
    }
    int count = 1;
    for (int i = 0; i < A.length(); i++) {
      if (A.charAt(i) == ' ')
        count++;
    }
    return count;
  }

  public static void main(String[] args) {
    String str = "welcome to code";
    reversWord(str);
    // countWord(str);
    // String str = "abc";
    // subString(str);
    // String str = "abcedcba";
    // System.out.println(checkPalindrome(str));
    // String str = "My Name is Nitesh Yadav!";
    // System.out.println(countWord(str));
  }
}
