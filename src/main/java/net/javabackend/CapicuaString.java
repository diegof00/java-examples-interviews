package net.javabackend;

import java.util.function.Predicate;

public class CapicuaString {

  public static void main(String[] args) {
    String texto1 = "allvessevilla";
    String texto2 = "uoiea";
    System.out.println(esCapicua(texto1)); // Imprime true
    System.out.println(esCapicua(texto2)); // Imprime true
  }

  public static boolean esCapicua(String texto) {
    // Verificar si es capicúa
    return esPalindromo.test(texto);
  }
  static Predicate<String> esPalindromo = s -> new StringBuilder(s).reverse().toString().equals(s);

}
