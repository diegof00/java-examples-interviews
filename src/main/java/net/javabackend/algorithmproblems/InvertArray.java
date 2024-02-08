package net.javabackend.algorithmproblems;


/**
 * This class is used to invert an array.
 * Time complexity: O(n).
 * Space complexity: O(1).
 */
public class InvertArray {

  public static void main(String[] args) {
    int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    invertArray(array);
    for (int j : array) {
      System.out.println(j);
    }
  }

  private static void invertArray(int[] array) {
    int n = array.length; // Length of the array
    for (int i = 0; i < n / 2; i++) {
      int temp = array[i];
      array[i] = array[n - i - 1];
      array[n - i - 1] = temp;
    }
  }

}
