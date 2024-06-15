public class Test {
    public static void main(String[] args) {
        String sentence = "Hello world this is a test";
        String reversedSentence = reverseSentenceBruteForce(sentence);
        System.out.println(reversedSentence);
    }

    public static String reverseSentenceBruteForce(String sentence) {
        // Split the sentence into words
        String[] words = sentence.split(" ");
        // Create a StringBuilder to build the reversed sentence
        StringBuilder reversed = new StringBuilder();
        
        // Loop through the words array in reverse order
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i != 0) {
                reversed.append(" "); // Add a space between words
            }
        }
        return reversed.toString();
    }
}
