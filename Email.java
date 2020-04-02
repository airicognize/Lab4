import java.util.*;

public class Email{
  public static void main(String[] args) {

   int at = 0;
   int afterat = 0;
   int afterdot = 0;

   Scanner sc = new Scanner(System.in);
   System.out.println("input");
   String email = sc.nextLine();

      int thelength = email.length();

    for (int i = 0; i < email.length(); i++) {
              if (email.charAt(i) == '@') {
                  at++;
                  afterat = i;
                }
             }
             //I'm using true to verify to see if it correctly identifies the @..
                  if (at == 1) {
                    System.out.println(true);
                  for (int i = 0; i < email.length(); i++ ) {
                    if (email.charAt(i) == '.') {
                      afterat++;
                      }
                    }
                      if (afterat == 1) {
                        System.out.println(true);
                        for (int i = 0; i < email.length(); i++ ) {
                          if (email.charAt(i) == '.') {
                          afterdot++;

                        }
                          if (afterdot == 1) {
                            System.out.println(true);
                            if (email.length() == i) {
                              System.out.println(false);
                            }
                            // I can't seem to make it so that it detects the two dots
                        } else {
                          System.out.println(false);
                        }

                      }

   } else {
     System.out.println(false);
   }
  }
 }
}
