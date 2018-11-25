package Storyline;

import characters.Person;
import characters.Player;
import tools.FormatName;
import tools.RequestResponse;
import tools.Wait;

/*
 * "INTRO" CLASS DESCRIPTION: Introduces player to the main story line, and tests user for response
 * to continue.
 * 
 * Also, Sets players name.
 * 
 */
public class Intro {
  public static String printIntro(Person mainPlayer, Person mysteryLady, Person console)
      throws InterruptedException {

    console.speak("***YOU AWAKEN FROM BEING UNCONSCIOUS***");
    Wait.twoSecTrue();
    console.speak("***YOUR HEAD ACHES AND YOUR BODY FEELS HEAVY***");
    Wait.twoSecTrue();
    console.speak("***YOU CAN HEAR THE FAINT BREATHING OF SOMEONE HOVERED OVER YOU***");
    Wait.threeDot(console);
    Wait.oneSecTrue();
    console.speak("***YOU OPEN YOUR EYES***");
    Wait.standardWait(mysteryLady);
    mysteryLady.speak("Ahh, you\'re awake!");
    Wait.standardWait(mysteryLady);
    mysteryLady.speak("I was wondering if you'd ever wake up or not.");
    Wait.twoSecTrue();
    mysteryLady.speak("Anywho, we have work to do. First thing's first. Whats your name?");
    RequestResponse.askForNameEntry(mainPlayer, mysteryLady);
    mysteryLady.speak("Okay " + mainPlayer.getName() + ", listen up.");
    Wait.standardWait(mysteryLady);
    mysteryLady.speak("I know this is probably a lot for you, it usually is for people.");
    Wait.standardWait(mysteryLady);
    mysteryLady.speak(
        "But, I need you to focus here, I'm a busy woman and I don't have \n\t\t     time to dilly-dally.");
    Wait.standardWait(mysteryLady);
    mysteryLady.setName("Mysterious Woman");
    mysteryLady.speak("Are you ready to get started?");
    String response = RequestResponse.yesNoHowTo();
    return response;
  }// End printIntro method


  /*
   * "MORE INFO" CLASS DESCRIPTION: This class presents the user with more information about the
   * INTRO,
   * 
   * And tests for response to continue.
   * 
   */

  public static String HowToPlay() throws InterruptedException {
    int i = 0;
    while (i < 12) {
      System.out.println();
      i++;
    }
    System.out
        .println("      ______________________________________________________________________");
    System.out
        .println("     |                                                                      |");
    System.out
        .println("     |                          ***HOW TO PLAY***                           |");
    System.out
        .println("     |                                                                      |");
    System.out
        .println("     |           This game is a Texted Based RPG game. The choices          |");
    System.out
        .println("     |           that you make in the game will directly influence          |");
    System.out
        .println("     |           the storyline that you receive. You will be tasked         |");
    System.out
        .println("     |           with decisions, and specific choices... and those          |");
    System.out
        .println("     |           decisions you make....ARE FINAL.                           |");
    System.out
        .println("     |                                                                      |");
    System.out
        .println("     |                            CHOOSE WISELY                             |");
    System.out
        .println("     |                                                                      |");
    System.out
        .println("     |______________________________________________________________________|");
    i = 0;
    while (i < 12) {
      System.out.println();
      i++;
    }
    Wait.oneSecTrue();
    System.out.println("Are you ready?");
    String response = RequestResponse.yesNo();
    return response;
  }// End moreInfo method



}// End Chapter1 class
