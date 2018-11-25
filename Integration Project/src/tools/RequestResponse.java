package tools;

import characters.Person;
import characters.Player;

/*
 * "STRINGRESPONSE" CLASS DESCRIPTION: This tool is used to request and return a response to an NPC.
 * 
 */


public class RequestResponse {


  public static String yesNoHowTo() {
    System.out
        .println(" _____________________________________________________________________________________");
    System.out
        .println("|                                                                                     |");
    System.out
        .println("|                               ***TYPE YOUR RESPONSE***                              |");
    System.out
        .println("|                                (YES)            (NO)                                |");
    System.out
        .println("|                                    (HOW TO PLAY)                                    |");
    System.out
        .println("|_____________________________________________________________________________________|");
    String response = Utility.scanner.nextLine();
    response = response.toUpperCase();
    return response;
  }// end yesNoMore method


  public static String yesNo() {
    System.out
        .println(" _____________________________________________________________________________________");
    System.out
        .println("|                                                                                     |");
    System.out
        .println("|                               ***TYPE YOUR RESPONSE***                              |");
    System.out
        .println("|                                (YES)            (NO)                                |");
    System.out
        .println("|_____________________________________________________________________________________|");

    String response = Utility.scanner.nextLine();
    response = response.toUpperCase();
//    TestInputForException.yesNoTest(response);
    return response;

  }// end yesNo

  public static String askForString() {
    System.out
        .println(" _____________________________________________________________________________________");
    System.out
        .println("|                                                                                     |");
    System.out
        .println("|                               ***TYPE YOUR RESPONSE***                              |");
    System.out
        .println("|_____________________________________________________________________________________|");
    String response = Utility.scanner.nextLine();
    return response;
  }// end askForString

  public static void askForNameEntry(Person mainPlayer, Person mysteryLady)
      throws InterruptedException {
    System.out
        .println(" _____________________________________________________________________________________");
    System.out
        .println("|                                                                                     |");
    System.out
        .println("|                                 ***TYPE YOUR NAME***                                |");
    System.out
        .println("|_____________________________________________________________________________________|");
    String nameEntry = Utility.scanner.nextLine();
    TestNameForCorrect.CorrectName(nameEntry, mainPlayer, mysteryLady);
  }// end askForNameEntry

  public static int askForAge(Person mainPlayer, Person mysteryLady) throws InterruptedException {
    System.out
        .println(" _____________________________________________________________________________________");
    System.out
        .println("|                                                                                     |");
    System.out
        .println("|                                 ***TYPE YOUR AGE***                                 |");
    System.out
        .println("|_____________________________________________________________________________________|");
    int response = TestInputForException.IntTest(mysteryLady);
    mainPlayer.setAge(response);
    mainPlayer.speak("I'm " + mainPlayer.getAge() + ".");
    Wait.oneSecTrue();
    return response;
  }// end askForInt

  public static void askForKarmaResult(Person mainPlayer, Person mysteryLady, ReputationOption[] karmaOptions) throws InterruptedException {
    System.out
        .println(" _____________________________________________________________________________________");
    System.out
        .println("|                                                                                     |");
    System.out
        .println("|                                 ***PICK A NUMBER***                                 |");
    System.out
        .println("|-------------------------------------------------------------------------------------|");
    for (int i = 0; i < karmaOptions.length; i++) {
      String Question = karmaOptions[i].getQuestion();
      int lengthOfQuestion = Question.length();
      int spacesToAdd = 80 - lengthOfQuestion;
      System.out.printf("|  " + (i + 1) + ". " + Question);
      for (int j = 0; j < spacesToAdd; j++) {
        System.out.printf(" ");
      }
      System.out.println("|");
    } // end Formatting
    System.out
        .println("|_____________________________________________________________________________________|");
    int response = Utility.scanner.nextInt();
    boolean badInput = true;
    while (badInput) {
      if (response>=1 && response<=karmaOptions.length) {
        badInput = false;
      }else {
        System.out.println("Choose A Number From the List Above.");
        response = Utility.scanner.nextInt();
      }
    }
    switch (response) {
      case 1:
        mainPlayer.setReputation(karmaOptions[0].getReputation());
        mainPlayer.speak(karmaOptions[0].getQuestion());
        Wait.standardWait(mysteryLady);
        mysteryLady.speak(karmaOptions[0].getReply());
        break;
      case 2:
        mainPlayer.setReputation(karmaOptions[1].getReputation());
        mainPlayer.speak(karmaOptions[1].getQuestion());
        Wait.standardWait(mysteryLady);
        mysteryLady.speak(karmaOptions[1].getReply());
        break;
      case 3:
        mainPlayer.setReputation(karmaOptions[2].getReputation());
        mainPlayer.speak(karmaOptions[2].getQuestion());
        Wait.standardWait(mysteryLady);
        mysteryLady.speak(karmaOptions[2].getReply());
        break;
      case 4:
        mainPlayer.setReputation(karmaOptions[3].getReputation());
        mainPlayer.speak(karmaOptions[3].getQuestion());
        Wait.standardWait(mysteryLady);
        mysteryLady.speak(karmaOptions[3].getReply());
        break;
      case 5:
        mainPlayer.setReputation(karmaOptions[4].getReputation());
        mainPlayer.speak(karmaOptions[4].getQuestion());
        Wait.standardWait(mysteryLady);
        mysteryLady.speak(karmaOptions[4].getReply());
        break;
    }
  }// end askForString

}
