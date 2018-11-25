package tools;

import characters.Person;

/*
 * "TESTNAME" CLASS DESCRIPTION: This tool is used to test a users response to PLAYERNAME,
 * 
 * it will prompt asking for error in PLAYERNAME and return,
 * 
 * a CORRECTNAME.
 */

public class TestNameForCorrect {

  public static void CorrectName(String name, Person MainPlayer, Person Narrator)
      throws InterruptedException {
    name = FormatName.Format(name);
    MainPlayer.setName(name);
    Narrator.speak(MainPlayer.getName() + ", Really?");
    Wait.standardWait(Narrator);
    boolean invalidInput = true;
    while (invalidInput) {
      Narrator.speak("So your name's " + MainPlayer.getName() + "?");
      String response = RequestResponse.yesNo();// returns a yes or a no
      switch (response) {
        case "NO":
          Narrator.speak("Okay, what was it then?");
          System.out
          .println(" _____________________________________________________________________________________");
          System.out
              .println("|                                                                                     |");
          System.out
              .println("|                             ***TYPE YOUR CORRECT NAME***                            |");
          System.out
              .println("|_____________________________________________________________________________________|");
          MainPlayer.setName(FormatName.Format(Utility.scanner.nextLine()));
          invalidInput = false;
          break;
        case "YES":
          invalidInput = false;
          break;
        default:
          Narrator.speak("Uhh what? That was supposed to be a \"yes/no\" question,");
          Narrator.speak("Let's try that again.");
      }
    }
  }// ends CorrectName

}// ends TestNameForCorrect

