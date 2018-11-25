package Storyline;

import java.util.concurrent.TimeUnit;

/*
 * "CREDITS" CLASS DESCRIPTION: This class is to run a CREDITS sequence when the user says no to
 * INTRO's response request of "continue?".
 */
public class Credits {

  public static void rollFalseCredits() throws InterruptedException {
    String jobRoles[] = {"Producer: Jeremy Martin", "Production Assistant: Jeremy Martin",
        "Development: Jeremy Martin", "Developmental Assitant: Jeremy Martin",
        "StoryLine: Jeremy Martin", "Senior Coffee Fetcher: Jeremy Martin",
        "Assistant Coffee Fetcher: Jeremy Martin", "Dog Walker: Jeremy Martin",
        "Assitant TO the Dog Walker: Jeremy Martin"};
    System.out.println(
        " _____________________________________________________________________________________");
    System.out.println(
        "|                                   ***THE END***                                     |");
    System.out.println(
        "|                                   ***CREDITS***                                     |");
    System.out.println(
        "|-------------------------------------------------------------------------------------|");
    for (int i = 0; i < jobRoles.length; i++) {
      String Role = jobRoles[i];
      int lengthOfRole = Role.length();
      int spacesToAdd = Math.round((85 - lengthOfRole) / 2);
      System.out.printf("|");
      for (int j = 0; j < spacesToAdd; j++) {
        System.out.printf(" ");
      }
      System.out.printf(Role);
      if ((lengthOfRole % 2) == 0) {
        for (int j = 0; j < spacesToAdd; j++) {
          System.out.printf(" ");
        }
        System.out.printf(" ");
      } else {
        for (int j = 0; j < spacesToAdd; j++) {
          System.out.printf(" ");
        }
      }
      System.out.println("|");
      System.out.println(
          "|                                                                                     |");
      TimeUnit.SECONDS.sleep(3);

    } // end Formatting
    System.out.println(
        "|_____________________________________________________________________________________|");
    // for (int i = 0; i < jobRoles.length; i++) {
    // Wait.twoSecTrue();
    // System.out.println();
    // System.out.printf("%53s%n", jobRoles[i]);
    // } // ends Loop
    // System.out.printf("%58s%n", "******************FIN******************");
    // Wait.oneSecTrue();
  }// ends Credits
}
