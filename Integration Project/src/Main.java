import Storyline.Credits;
import Storyline.Intro;
import Storyline.chapter1;
import tools.Utility;
import tools.playerStats;

/*
 * Jeremy Martin
 * 
 * Project Description:
 *
 * My project will be a simple game involving choices and a story line. AKA a text based rpg, with a
 * decision based story line.
 */

public class Main {

  public static void main(String[] args) throws InterruptedException {
    playerStats.setLiving(true);
    boolean invalidInput = true;
    String menuSelection = Intro.printIntro(); // returns yesnomore
    while (invalidInput) {
      switch (menuSelection.toUpperCase()) {
        case "YES":
          chapter1.section1();
          invalidInput = false;
          break;
        case "NO":
          Credits.rollFalseCredits();
          invalidInput = false;
          break;
        case "MORE INFO":
          menuSelection = Intro.moreInfo();
          break;
        default:
          System.out.println("PLEASE ENTER A CORRECT OPTION");
          menuSelection = Utility.scanner.nextLine();
      } // end switch conditional statement
    } // end while loop
  } // end main method
} // end Main class
