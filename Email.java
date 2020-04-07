/**
 *
 * a program that validates emails.
 *
 *  @author Jeremie Guerchon
 */
import java.util.*;

public class Email{
  public static void main(String[] args) {

   int atlocation = 0;
   int dotlocation = 0;
   int dotdotlocation = 0;
   int confirm = 0;

   Scanner sc = new Scanner(System.in);
   System.out.println("input");
   String email = sc.next();

   boolean foundAt = false;
   boolean foundDot = false;
   boolean foundDotDot = false;

   int emaillength = email.length();

    for (int i = 0; i < email.length(); i++) {
              if (email.charAt(i) == '@') {
                  foundAt = true;
                  confirm++;
                  atlocation = i;
                } else {

                }
             }

             if (confirm == 0) {
               System.out.println("This email is Invalid");
             }
             //I'm using true to verify to see if it correctly identifies the @..
                  if (foundAt == true) {
                  for (int i = atlocation; i < email.length(); i++ ) {
                    if (email.charAt(i) == '.') {
                      foundDot = true;
                      confirm = 1;
                      dotlocation = i;
                     }
                    }
                      if (foundDot == true && dotlocation < emaillength) {
                        for (int i = dotlocation; i < email.length(); i++ ) {
                          if (email.charAt(i) == '.') {
                          foundDotDot = true;
                          confirm = 2;
                          dotdotlocation = i;

                         }
                        }
                          if (foundDotDot == true && dotdotlocation != emaillength) {
                            confirm = 3;
                        } else {
                        }
                        if (email.endsWith(".")) {
                        System.out.println("This email is invalid");
                      } else if (foundDot == true || foundDotDot == true && foundAt == true && dotdotlocation != emaillength) {
                          System.out.println("This email is valid");
                        } else {
                          System.out.println("This email is invalid");
                        }

        } else {
       System.out.println("This email is invalid");
        }
  }
 }
}
