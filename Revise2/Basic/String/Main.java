public class Main {

  public static void compressString(String A) {
    for (int i = 0; i < A.length(); i++) {
        int count = 0; // Initialize count for the current character
        char curr = A.charAt(i);

        // Count consecutive occurrences of the current character
        for (int j = i; j < A.length(); j++) {
            if (A.charAt(j) == curr) {
                count++;
            } else {
                i = j - 1; // Adjust the outer loop index to skip processed characters
                break;
            }
        }

        // Print the character and its count
        System.out.println(curr + " " + count);

        // Handle the last group explicitly
        if (i == A.length() - 1) {
            break;
        }
    }
}


  public static void removeDuplicate(String A) {
    StringBuilder str = new StringBuilder();
    for (int i = 0; i < A.length(); i++) {
      char currElm = A.charAt(i);
      System.out.println(i + " " + currElm);
      int j = i + 1;
      while (j < A.length() && A.charAt(j) == currElm) {
        j++;
      }
      str.append(currElm);

      i = j - 1;

    }
    System.out.println(str);
  }

  public static void main(String[] args) {
    // String str = "aaabbaaccccddddddd";
    String str = "aaabbcc";

    // removeDuplicate(str);
    // compressString(str);
    compressString(str);
  }
}