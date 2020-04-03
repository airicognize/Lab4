//I'll be doing the javadoc as soon as I can be sure this is right!

import java.util.*;

public class Emailfix{
  public static void main(String[] args) {

   int atlocation = 0;
   int dotlocation = 0;
   int dotdotlocation = 0;
   int confirm = 0;

   Scanner sc = new Scanner(System.in);
   System.out.println("input");
   String email = sc.nextLine();
  
    //Thank you for this tip, I was so happy it worked ;-;
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
              /*Had to make it so that it would say it's invalid and made sure it doesn't repeat it after every char...
               * Weirdly enough... Using confirm++ at first but then changing it back to 1 for the next bit seemed to help me doing so hehe
               */
               
             if (confirm == 0) {
               System.out.println("This email is Invalid");
             }
             //Ind
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
                          if (foundDotDot == true && dotdotlocation < emaillength) {
                            confirm = 3;
                            // I can't seem to make it so that it detects the two dots
                        } else {
                          System.out.println("This email is invalid");
                        }

                        if (foundDot == true || foundDotDot == true && foundAt == true) {
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
