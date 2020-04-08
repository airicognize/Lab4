import java.util.*;

public class Question43{
  public static void main(String[] args) {

    boolean maxsqrt = false;
    int sqrts = 0;
    double moretries;
    boolean moreten = false;


    Scanner sc = new Scanner(System.in);

    System.out.println("Please enter a number higher than 10.");
    double number = sc.nextDouble();
    double tosqrt = number;


    if (number > 10) {
      while(tosqrt >= 1.01) {
        tosqrt = Math.sqrt(tosqrt);
        sqrts++;
      }
      System.out.println("squares total " + sqrts);
    }

    if (number < 10) {
      while (moreten == false) {
        System.out.println("INVALID. Please enter a number higher than 10.");
        number = sc.nextDouble();
        tosqrt = number;
        if (tosqrt > 10) {
          moreten = true;
        }
      }
      if (moreten == true) {
        while(tosqrt >= 1.01) {
          tosqrt = Math.sqrt(tosqrt);
          sqrts++;
        }
        System.out.println("squares total: " + sqrts);
      }
    }
  }
}
