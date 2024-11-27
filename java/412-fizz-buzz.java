import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FizzBuzz {


    // My FizzBuzz Solution using Array
    public static String[] myFizzBuzz(int n) {

        String[] answer = new String[n];    

        for (int i = 0; i < n; i++) {
            if ((i + 1) % 3 == 0 && (i + 1) % 5 == 0) answer[i] = "FizzBuzz";
            else if ((i + 1) % 3 == 0) answer[i] = "Fizz";
            else if ((i + 1) % 5 == 0) answer[i] = "Buzz";
            else answer[i] = String.valueOf(i + 1);  
        }       

        return answer;
    }
    

    // my LeetCode Submitted Solution using List
    public static List<String> fizzBuzz(int n) {

        List<String> answer = new ArrayList<String>(n);    

        for (int i = 0; i < n; i++) {
            if ((i + 1) % 3 == 0 && (i + 1) % 5 == 0) answer.add("FizzBuzz");
            else if ((i + 1) % 3 == 0) answer.add("Fizz");
            else if ((i + 1) % 5 == 0) answer.add("Buzz");
            else answer.add(String.valueOf(i + 1));  
        }       

        return answer;
    }




    public static void main(String[] args) {

        System.out.println(Arrays.toString(myFizzBuzz(15)));

        List<String> result = fizzBuzz(15);
        System.out.println(result);
    }

}