/**
 * This program asks for 10 integers and then outputs the smallest integer.
 *
 * @author Jeremie Guerchon
 */

import java.util.*;

public class Question51{
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Please input 10 integers>>");
    int number = sc.nextInt();
    int inputs = 1;
    int morenumbers = 0;
    for (inputs = 1; inputs < 9 ; inputs++ ) {
      System.out.println("Please input more integers>>");
      morenumbers = sc.nextInt();
      if (morenumbers < number) {
           number = morenumbers;
        }
    }
      System.out.println("The lowest value of the integers you gave is " + number);
  }
}
