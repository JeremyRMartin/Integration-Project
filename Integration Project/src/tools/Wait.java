package tools;

import java.util.Random;
import java.util.concurrent.TimeUnit;
import Storyline.Credits;
import characters.Person;

/*
 * "WAIT" CLASS DESCRIPTION: This tool is used to wait a certain amount of time before continuing.
 */
public class Wait {

  public static void threeDot(Person console) throws InterruptedException {// waits for 3 seconds and prints a dot
    for (int i = 0; i < 3; i++) {
      Wait.oneSecTrue();
      console.speak(".");
    } // ends Loop
  }// ends threeDot

  public static void twoSecTrue() throws InterruptedException {// waits for 2 seconds
    TimeUnit.SECONDS.sleep(2);
  }// ends twoSec

  public static void oneSecTrue() throws InterruptedException {// waits for 1 seconds indefinitely
    TimeUnit.SECONDS.sleep(1);
  }// ends twoSec

  public static void standardWait(Person mysteryLady) throws InterruptedException {// waits for 1
                                                                                // second based
                                                                                // on cases
    Random rnd = new Random();
    if (mysteryLady.getHasCoughDrops() == false) {// if the Narrator doesn't have cough drops she will
                                               // cough often
      int r = rnd.nextInt(25);
      if (r != 1) {
        TimeUnit.SECONDS.sleep(2);
      } else {
        mysteryLady.cough();
      }
    } else {// if she does have them she wont cough as often
      int r = rnd.nextInt(300);
      if (r != 1) {
        TimeUnit.SECONDS.sleep(2);
      } else {
        mysteryLady.cough();
      }
      // } // ends Internal if else
    } // ends if else
  }// ends oneSec

  public static void sleep(Person console) throws InterruptedException {// player sleeps through the night
    for (int i = 0; i < 5; i++) {
      Wait.oneSecTrue();
      console.speak("z");
    } // ends Loop
    Wait.oneSecTrue();
  }// ends sleep

}// ends wait class
