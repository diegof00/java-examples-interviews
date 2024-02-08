package net.javabackend.algorithmproblems;

/**
 * This class is used to check if a string is a palindrome.
 */
public class Palindrome {

  public static void main(String[] args) {
    String word = "racecar";
    System.out.println(isPalindrome(word));
  }

  public static boolean isPalindrome(String word) {
    int n = word.length();
    for (int i = 0; i < n / 2; i++) {
      if (word.charAt(i) != word.charAt(n - i - 1)) {
        return false;
      }
    }
    return true;
  }

}
