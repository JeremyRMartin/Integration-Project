import Storyline.Credits;
import Storyline.Intro;
import characters.Narrator;
import characters.Person;
import characters.Player;
import Storyline.Chapter1;
import tools.RequestResponse;
import tools.Utility;

public class Main {

  public static void main(String[] args) throws InterruptedException {
    // POLYMOPRHISM
    // MainPlayer is a new Player being created of type Person.
    Person mainPlayer = new Player(100.0, true);
    Person mysteryLady = new Person("Mysterious Figure");
    Person console = new Narrator();
    boolean invalidInput = true;
    String menuSelection = Intro.printIntro(mainPlayer, mysteryLady, console); // returns "yes, no,
                                                                               // how to play"
    while (invalidInput) {
      switch (menuSelection.toUpperCase()) {
        case "YES":
          mainPlayer.speak("Sure.");
          Chapter1.section1(mainPlayer, mysteryLady, console);
          invalidInput = false;
          break;
        case "NO":
          mainPlayer.speak("Nah, I'm good.");
          Credits.rollFalseCredits();
          System.out.println();
          System.out.println();
          System.out.println();
          mysteryLady.speak("Done Messing Around?");
          menuSelection = RequestResponse.yesNo();
          break;
        case "HOW TO PLAY":
          menuSelection = Intro.HowToPlay();
          break;
        default:
          System.out.println("PLEASE ENTER A CORRECT OPTION");
          menuSelection = Utility.scanner.nextLine();
      } // end switch conditional statement
    } // end while loop
  } // end main method
} // end Main class
