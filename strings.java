public class strings {
  /**
   * Problem Description
   * You are given a character string A having length N, consisting of only
   * lowercase and uppercase latin letters.
   * 
   * You have to toggle case of each character of string A. For e.g 'A' is changed
   * to 'a', 'e' is changed to 'E', etc.
   * 
   * A = "Hello" Output =hELLO
   */
  // Algo :
  /**
   * Method: 1
   * we can solve using create the char array
   * then iterate over the array and if char is lower letter than substract 32
   * from it
   * else if capital letter then add 32 to it.
   * Method: 2
   * create the stringbuilder than appned according to the condition
   * 
   * @param A
   * @return
   */
  public static String toggleLetter(String A) {
    StringBuilder s = new StringBuilder();
    for (int i = 0; i < A.length(); i++) {
      if (A.charAt(i) >= 65 && A.charAt(i) <= 90) {
        s.append((char) (A.charAt(i) + 32));
      } else if (A.charAt(i) >= 97 && A.charAt(i) <= 122) {
        s.append((char) (A.charAt(i) - 32));
      }
    }
    return s.toString();
  }

  /**
   * Problem Description
   * Given a string A, you are asked to reverse the string and return the reversed
   * string.
   * 
   * A = "scaler" output:: "relacs"
   */
  public static String reverseString(String A) {
    StringBuilder s = new StringBuilder(A);
    s.reverse();
    // for (int i = 0; i < A.length(); i++) {

    // }
    return s.toString();
  }
  /**
   * Problem Description
   * You are given a string A of size N.
   * 
   * Return the string A after reversing the string word by word.
   * 
   * NOTE:
   * 
   * A sequence of non-space characters constitutes a word.
   * Your reversed string should not contain leading or trailing spaces, even if
   * it is present in the input string.
   * If there are multiple spaces between words, reduce them to a single space in
   * the reversed string.
   */
  
   public static void reverseWord(String A){
    
   }
  /**
   * Problem Description
   * Akash likes playing with strings. One day he thought of applying following
   * operations on the string in the given order:
   * 
   * Concatenate the string with itself.
   * Delete all the uppercase letters.
   * Replace each vowel with '#'.
   * You are given a string A of size N consisting of lowercase and uppercase
   * alphabets. Return the resultant string after applying the above operations.
   * 
   * NOTE: 'a' , 'e' , 'i' , 'o' , 'u' are defined as vowels.
   * 
   * A="aeiOUz" output ="###z###z"
   */
}
