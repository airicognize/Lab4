/**
 * This program asks for a word and then outputs each characters with spaces.
 *
 * @author Jeremie Guerchon
 */

import java.util.*;

public class Question50{
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Please input a word");
    String word = sc.next();

    for (int i = 0; i < word.length(); i++) {

      System.out.println("\n" + word.charAt(i));

    }
  }
}
