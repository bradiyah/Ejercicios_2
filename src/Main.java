import org.junit.jupiter.api.Test;
import java.util.*;
public class Main {
  public static void main(String[] args) {

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
    return 0;

  }


  public static boolean isPrime(int num){

      return false;
  }

  public static int checkNumberOfPrimes(int [] numbers){

      return 0;
  }

  public static boolean isIdentityMatrix(int [][] matrix){
    return false;
  }

}