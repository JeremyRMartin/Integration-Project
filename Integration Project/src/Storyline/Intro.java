package Storyline;

import characters.oldMan;
import tools.playerStats;
import tools.requestResponse;
import tools.wait;

/* "INTRO" CLASS DESCRIPTION:
 * Introduces player to the main story line,
 * and tests user for response to continue.
 * 
 * Also, Sets players name.
 * 
 */
public class Intro {
  public static String printIntro() throws InterruptedException {
    System.out.printf("%53s%n", "***YOU AWAKEN FROM BEING UNCONSCIOUS***");
    wait.twoSec();
    System.out.printf("%57s%n", "***YOUR HEAD ACHES AND YOUR BODY FEELS HEAVY***");
    wait.twoSec();
    System.out.printf("%33s%n",
        "***YOU CAN HEAR THE FAINT BREATHING OF SOMEONE HOVERED OVER YOU***");
    wait.threeDot();
    wait.oneSec();
    System.out.printf("%47s%n", "***YOU OPEN YOUR EYES***");
    wait.oneSec();
    System.out.println("[" + oldMan.getName() +  "]- Ahh, you\'re awake!");
    wait.oneSec();
    System.out.println("[" + oldMan.getName() +  "]- You withstood quite the beating back there.");
    wait.twoSec();
    System.out.println("[" + oldMan.getName() +  "]- Hey, whats your name anyway?");
    requestResponse.askForNameEntry();
    System.out.println("[" + oldMan.getName() +  "]- Okay " + playerStats.getName() + ", heres the sitch.");
    wait.twoSec();
    System.out.println("[" + oldMan.getName() +  "]- Look, I'm surprised you're even alive right now,");
    wait.oneSec();
    System.out.println("[" + oldMan.getName() +  "]- and I know it's probably inappropriate for me to ask a favor");
    wait.oneSec();
    System.out.println("[" + oldMan.getName() +  "]- from a half alive corpse, but we are desperate here.");
    wait.twoSec();
    System.out.println("[" + oldMan.getName() +  "]- Would you possibly be able to help us?");
    String response = requestResponse.yesNoMore();
    return response;
  }// End printIntro method

  
  /* "MORE INFO" CLASS DESCRIPTION:
   * This class presents the user with more information about the INTRO,
   * 
   * And tests for response to continue.
   * 
   */

  public static String moreInfo() throws InterruptedException {
    System.out.println("{ENTER (MORE INFO ABOUT CHAPTER 1)}");
    wait.twoSec();
    System.out.println("[" + oldMan.getName() +  "]- So what do you say?");
    String response = requestResponse.yesNo();
    response = response.toUpperCase();
    return response;
  }// End moreInfo method



}// End Chapter1 class
