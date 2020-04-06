/**
 * 
 * a program that receives a word as an input from the user and checks if it is a palindrome: if it reads the same backward as forward.
 *
 */

import java.util.*;

public class Palindrome{
  public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);

     System.out.println("Please input a word for us to check if it is a Palindrome.");
     String input = sc.nextLine().trim();
     String reverse = "";

     String inputL = input.toLowerCase();
     String inputf= inputL.replaceAll("\\s","");
     String inputt= inputL.replaceAll("\\W","");

       for(int i = inputt.length() - 1; i >= 0; i--)
       {
        reverse = reverse + inputt.charAt(i);
       }

      String reversedL = reverse.toLowerCase();

      if (reversedL.equals(inputt)) {
        System.out.println("Your input is a Palindrome.");
      } else {
        System.out.println("Your input is not a Palindrome");

      }
  }
}
