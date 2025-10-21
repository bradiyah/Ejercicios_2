import org.junit.jupiter.api.Test;
import org.w3c.dom.ls.LSOutput;

import java.util.*;

import static java.awt.SystemColor.text;

public class Main {

  public static void main(String[] args) {

      System.out.println(isPrime(2));
      System.out.println(isPrime(4));
      System.out.println(isPrime(17));
      System.out.println(isPrime(20));

      String frase = "Hola aqui testeando";
      checkWordLength(frase);

  }

    public static int checkWordLength(String word) {
        String[] words = word.trim().split("\\s+");
        int maxLength = 0;

        for (String palabra : words) {
            if (palabra.length() > maxLength) {
                maxLength = palabra.length();
            }
        }

        return maxLength;
    }

  public static int NumOfVowels(String vocales){
      int contador = 0;

      char[] vowels = vocales.toCharArray();
      for (char c:vowels){
          if ("aeiouAEIOU".indexOf(c)!= -1){
              contador++;
          }
      }
    return contador;

  }


  public static boolean isPrime(int n){
      if (n < 2){
          return false;
      }
      if ( n == 2){
          return true;
      }

      if (n % 2 == 0){
          return false;
      }

      for (int i = 3; i <= Math.sqrt(n) ; i+=2) {
          if(n % i == 0){
              return false;
          }

      }

      return true;


  }

  public static int checkNumberOfPrimes(int [] numbers){
        int contador = 0;
        for (int n : numbers){
            if (isPrime(n)){
                contador++;
            }
        }
      return contador;
  }

  public static boolean isIdentityMatrix(int [][] matrix){
    return false;
  }

}