public class PalindromeChecker {
   public static boolean isPalindrome(String word) {
      // Step 1: Remove whitespace
      var noWhiteSpaces = "";

      for (int i = 0; i < word.length(); i++) {
         char character = word.charAt(i);
         if (!Character.isWhitespace(character)) {
            noWhiteSpaces += character;
         }
      }

      // Step 2: Convert to lowercase
      String stand_no_uppercase = noWhiteSpaces.toLowerCase();

      // Palindrome check
      int length = stand_no_uppercase.length();
      for (int i = 0; i < length / 2; i++) {
         if (stand_no_uppercase.charAt(i) != stand_no_uppercase.charAt(length - i - 1)) {
            return false;
         }
      }
      return true;
   }

   public static void main(String[] args) {
      String word = "Angolo Bar a Bologna";
      if (isPalindrome(word)) {
         System.out.println(word + " ist ein Palindrom.");
      } else {
         System.out.println(word + " ist kein Palindrom.");
      }
   }
}
