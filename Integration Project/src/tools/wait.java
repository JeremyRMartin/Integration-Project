package tools;

import java.util.concurrent.TimeUnit;

/* "WAIT" CLASS DESCRIPTION:
 * This tool is used to wait a certain amount of time before continuing.  
 */
public class wait {

  public static void threeDot() throws InterruptedException {//waits for 3 seconds and prints a dot
    for (int i = 0; i < 3; i++) {
      TimeUnit.SECONDS.sleep(1);
      System.out.printf("%35s%n", ".");
    } // ends Loop
  }// ends threeDot

  public static void twoSec() throws InterruptedException {//waits for 2 seconds
    for (int i = 0; i < 1; i++) {
      TimeUnit.SECONDS.sleep(2);
    } // ends Loop
  }// ends twoSec

  public static void oneSec() throws InterruptedException {//waits for 1 second
    for (int i = 0; i < 1; i++) {
      TimeUnit.SECONDS.sleep(1);
    } // ends Loop
  }// ends oneSec


  public static void sleep() throws InterruptedException {//player sleeps through the night
    wait.threeDot();
    wait.threeDot();
  }// ends sleep
}
