import java.util.*;

public class Email2.0{
  public static void main(String[] args) {
    
    //I tried doing things such asboolean foundDot = true on my variable list but that wouldn't work either..
    boolean foundDot,foundAt,foundDotDot;

   int atlocation = 0;
   int dotlocation = 0;
   int dotdotlocation = 0;
   int confirm = 0;

   Scanner sc = new Scanner(System.in);
   System.out.println("input");
   String email = sc.nextLine();

      int emaillength = email.length();

    for (int i = 0; i < email.length(); i++) {
              if (email.charAt(i) == '@') {
                  foundAt = true;
                  confirm++;
                  atlocation = i;
                }
             }
             //I'm using true to verify to see if it correctly identifies the @..
                  if (foundAt == true) {
                  for (int i = atlocation; i < email.length(); i++ ) {
                    if (email.charAt(i) == '.') {
                      foundDot = true;
                      confirm++;
                      dotlocation = i;
                     }
                    }
                      if (foundDot == true && dotlocation < emaillength) {
                        for (int i = dotlocation; i < email.length(); i++ ) {
                          if (email.charAt(i) == '.') {
                          foundDotDot = true;
                          confirm++;
                          dotdotlocation = i;

                         }
                        }
                          if (foundDotDot == true && dotdotlocation < emaillength) {
                            confirm++;
                            // I can't seem to make it so that it detects the two dots
                        } else {
                          System.out.println(false);
                        }

                        if (confirm == 2 && confirm == 3) {
                          System.out.println("This email is valid");
                        } else {
                          System.out.println("This email is invalid");
                        }

   } else {
     System.out.println(false);
    }
  }
 }
}
