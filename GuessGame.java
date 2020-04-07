/** 
 * This program asks the user to guess the number the program picked between 1-100. If failed, they have 10 chances until
 * the program shuts down.
 *
 * @author Jeremie Guerchon
 */

import java.util.*;
import java.lang.*;

public class GuessGame{
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    Random rand = new Random();
    int random = rand.nextInt(101);
    int again = 0;
    boolean nomore = false;

    System.out.println("Welcome to Sibyl System v2.03");

    System.out.println("\nGuess the number");

    int guess = sc.nextInt();

    again = 1;

    while (guess != random && again != 10 && nomore == false) {
        System.out.println("Wrong! Do you want to try again? Type 1 for yes and 2 for no");
         int yesno = sc.nextInt();
         if (yesno == 1) {
           again++;
           System.out.println("What number am I guessing?");
          random = rand.nextInt(101);
          guess = sc.nextInt();
          if (again == 10) {
            System.out.println("\nYou've tried too many times, try your luck later!");
          }
        } else if (yesno == 2) {
           nomore = true;
           System.out.println("\nGoodbye, see you next time! You may close this window.");
         }

    }

    if (guess == random) {
      System.out.println("Congratulations, you've won!");
    }

  }
}
