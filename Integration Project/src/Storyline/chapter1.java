package Storyline;

import characters.oldMan;
import tools.ageGen;
import tools.playerStats;
import tools.requestResponse;
import tools.wait;

public class chapter1 {

  public static void section1() throws InterruptedException {
    System.out
        .println("[" + oldMan.getName() + "]- Okay good, why don't you get a bit more sleep and");
    wait.oneSec();
    System.out.println("[" + oldMan.getName() + "]- we can pick up in the morning.");
    wait.oneSec();
    System.out.printf("%44s%n", "***YOU DOZE OFF***");
    wait.sleep();
    System.out.printf("%43s%n", "***YOU WAKE UP***");
    wait.twoSec();
    System.out.println("[" + oldMan.getName() + "]- As, you can tell, I'm getting a bit older.");
    wait.oneSec();
    int oldManAge = ageGen.randomAge();
    System.out.println("[" + oldMan.getName() + "]- " + oldManAge + " to be exact.");
    wait.oneSec();
    System.out.println("[" + oldMan.getName() + "]- How old are you anyway?");
    int playersAge = Math.abs(requestResponse.askForInt());
    playerStats.setAge(playersAge);
    if (playersAge > oldManAge) {
      oldMan.setName("Young Man");
      System.out.println("[" + oldMan.getName()
          + "]- Oof, maybe you should sit this one out so you don't break a bone old man.");
    } else if (playersAge < oldManAge) {
      System.out.println("[Old Man]- Kids like you are much more limber than an old man like me.");
    } else {
      oldMan.setName("Same Aged Man");
      System.out.println("[" + oldMan.getName() + "]- Twinsies.");
    } // ends if statement
    wait.oneSec();
    System.out.println("[" + oldMan.getName() + "]- Anywho. ");
  }// ends section1

  public static void randomIntegrationWithNoUseYet() {

    // Random .equals and == (still need to have a purpose to implement one)
    String stringOne = "This is String One.";
    String stringTwo = "This is String Two.";
    if (stringOne.equals(stringTwo)) {
      System.out.println("Interesting.");
    } else {
      System.out.println("Well, Duh they are two different Strings.");
    } // end if statement
    /*
     * if you were to use the "==" comparison operator then you would get an error, this does not
     * work for strings. What the "==" comparison operator does is compares two variables, and tests
     * if they point to the same location in memory.
     */

    // Random Ternary example(still need to have a purpose to implement one)
    int a = 50;
    int b = 51;
    int c = ++b;// this is a pre-increment meaning it will add one to b before saving the value to
                // c. (operator precedence)
    int minVal = a < b ? a : b;
    System.out.println(minVal);
    System.out.println("c will always be one more digit than b, see? " + b + " " + c);
  }// ends section2
}// ends chapter1
