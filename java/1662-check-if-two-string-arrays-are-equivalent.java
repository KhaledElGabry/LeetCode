import java.util.Arrays;
import java.util.stream.Collectors;


public class TwoStringsArrayAreEqual {
     public static void main(String[] args) {

          String[] word1 = { "Khaled", "El", "Gabry" };
          String[] word2 = { "Khaled", "ElGabry" };


          arrayStringsAreEqual(word1, word2);
     }

     // My LeetCode Submited Solution
     public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {


          String joinStr1 = Arrays.stream(word1).collect(Collectors.joining());
          String joinStr2 = Arrays.stream(word2).collect(Collectors.joining());

          if (joinStr1.toLowerCase().equals(joinStr2.toLowerCase())) {
               System.out.println(true);
               return true;
          }

          System.out.println(false);
          return false;
     }
}