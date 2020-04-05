/**
 * @author Jeremie Guerchon
 * A program that reads the first 3 doubles from a text file and makes an average
 * of them.
 */

import java.util.*;
import java.io.*;
import java.text.*;

public class Question45 {
  public static void main(String[] args) throws FileNotFoundException {

    File ft = new File("random.txt");

    Scanner sc = new Scanner(ft);

    DecimalFormat f = new DecimalFormat("#0.00");

    double first = sc.nextDouble();
    double second = sc.nextDouble();
    double third = sc.nextDouble();
    float average = (float)(first+second+third)/3;



    System.out.printf("The average of the doubles from the file is " + f.format(average));
  }
}
