/*
 * @author Jeremie Guerchon
 * a program that generates a random number between 0 and 100 and asks the user to guess it. The user can have at maximum 10 trials. 
 * If the number is guessed, the user should be asked if she/he wants to play again. If the number is not guessed and 10 trials were used, 
 * the user is not lucky, the program should terminate with a proper message.
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

    System.out.println("Guess the number");

    int guess = sc.nextInt();

    while (guess != random && again <= 10 && nomore == false) {
        System.out.println("Wrong! Do you want to try again? Type 1 for yes and 2 for no");
         int yesno = sc.nextInt();
         if (yesno == 1) {
           again++;
           System.out.println("What number am I guessing?");
          random = rand.nextInt(101);
          guess = sc.nextInt();
         } else if (yesno == 2) {
           nomore = true;
           System.out.println("Goodbye");
         }

    }

    if (guess == random) {
      System.out.println("Congratulations, you've won!");
    }

  }
}
