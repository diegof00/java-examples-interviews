package net.javabackend;

import java.util.HashMap;
import java.util.Map;

/**
 * This class is used to map the alphabet to a number.
 */
public class AlphabetMap {

  public static void main(String[] args) {
    String alphabet = "abcdefghijklmnopqrstuvwxyz";
    Map<Character, Integer> alphabetMap = new HashMap<>();
    for (int i = 0; i < alphabet.length(); i++) {
      alphabetMap.put(alphabet.charAt(i), i+1);
    }
    System.out.println(alphabetMap);
  }

}
