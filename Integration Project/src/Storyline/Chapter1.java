package Storyline;


import tools.ageGen;
import characters.Person;
import characters.Player;
import tools.ReputationOption;
import tools.RequestResponse;
import tools.Utility;
import tools.Wait;

public class Chapter1 {

  public static void section1(Person MainPlayer, Person mysteryLady, Person console)
      throws InterruptedException {
    Wait.twoSecTrue();
    mysteryLady.speak("Good Choice.");
    Wait.standardWait(mysteryLady);
    mysteryLady.speak("Follow me. Let's walk and talk.");
    Wait.standardWait(mysteryLady);
    mysteryLady.speak("I'm sure you have loads of questions like,");
    Wait.standardWait(mysteryLady);
    mysteryLady.speak("\"Where am I?\"");
    Wait.oneSecTrue();
    mysteryLady.speak("\"Who is this lady?\"");
    Wait.oneSecTrue();
    mysteryLady.speak("\"What is that unsufferable smell?\"");
    Wait.standardWait(mysteryLady);
    mysteryLady.speak("Dont worry we will get to all of those,");
    Wait.twoSecTrue();
    mysteryLady.speak("except for maybe that last one.");
    Wait.standardWait(mysteryLady);
    mysteryLady.speak(
        "For now though, you should get some sleep, you're gonna need your \n\t\t    strength.");
    Wait.twoSecTrue();
    console.speak("***THE WOMAN SNAPS HER FINGERS***");
    Wait.oneSecTrue();
    System.out.println();
    console.speak("***YOU COLLAPSE INTO A SLEEP***");
    Wait.sleep(console);
    console.speak("***YOU WAKE UP***");
    System.out.println();
    MainPlayer.speak("Huh? What was that, thats not okay!");
    Wait.oneSecTrue();
    mysteryLady.speak("Oh, Pardon Me.");
    Wait.twoSecTrue();
    mysteryLady.speak("You must still be confused in the Heirarchy of things here.");
    Wait.standardWait(mysteryLady);
    mysteryLady.speak("Dont worry, you seem like you'll catch on quick.");
    Wait.twoSecTrue();
    mysteryLady.speak("Unlike the others.");
    Wait.twoSecTrue();
    mysteryLady.speak("*AHEM* As I was saying.");
    Wait.twoSecTrue();
    mysteryLady.speak("I'm sure you can tell I'm not as young as I once may have been.");
    mysteryLady.cough();

    int narratorAge = ageGen.randomAge();
    mysteryLady.speak(narratorAge + " to be exact.");
    Wait.standardWait(mysteryLady);

    mysteryLady.speak("How old would you like me to address you as?");
    int playersAge = Math.abs(RequestResponse.askForAge(MainPlayer, mysteryLady));
    MainPlayer.setAge(playersAge);

    if (playersAge > narratorAge) {
      mysteryLady.setName("Young " + mysteryLady.getName());
      mysteryLady
          .speak("Oof, maybe you should sit this one out so you don't break a bone. Kidding.");
    } else if (playersAge < narratorAge) {
      mysteryLady.speak("Ah Yes, kids like you are much more limber than an old lady like me.");
    } else {
      mysteryLady.setName("Same Aged " + mysteryLady.getName());
      mysteryLady.speak("No Way! Twinsies!");
      Wait.standardWait(mysteryLady);
      Wait.standardWait(mysteryLady);
      mysteryLady.speak("*AHEM* Anywho.");
    } // ends if statement

    Wait.standardWait(mysteryLady);
    mysteryLady.speak("I've been struggling with this nasty cough.");
    Wait.standardWait(mysteryLady);
    mysteryLady.speak("Say, you dont happen to have any cough drops do you?");
    Utility.scanner.nextLine();
    String coughDrops = RequestResponse.yesNo();
    if (coughDrops.equals("YES")) {
      MainPlayer.speak("Sure, Here you go.");
      mysteryLady.setHasCoughDrops(true);
      Wait.standardWait(mysteryLady);
      mysteryLady.speak("Thank Heavens, this should do wonders.");
      Wait.standardWait(mysteryLady);
    } else if (coughDrops.equals("NO")) {
      MainPlayer.speak("I just gave away my last one, sorry.");
      Wait.standardWait(mysteryLady);
      mysteryLady.speak("Strike ONE!");
      Wait.standardWait(mysteryLady);
      mysteryLady.speak("Kidding, You should really learn to lighten up.");
      Wait.standardWait(mysteryLady);
    } // ends if statement

    mysteryLady.speak("Alright, first question, this one should be simple enough:");
    mysteryLady.speak("Do you like me?");
    ReputationOption[] karmaOptions1 = new ReputationOption[5];
    karmaOptions1[0] = new ReputationOption("I \"like-like\" you, if you dig my vibe.", 30,
        "You're not to bad yourself.");
    karmaOptions1[1] = new ReputationOption("Sure, you seem okay.", 1, "*Giggles*");
    karmaOptions1[2] =
        new ReputationOption("...heh....", 0, "You're right that was weird, forget I asked.");
    karmaOptions1[3] =
        new ReputationOption("I literally just met you. WTF.", -1, "Yeah, you're right.");
    karmaOptions1[4] = new ReputationOption("Why dont you go and die already, just leave me alone.",
        -10, "*Sheds a single tear*");
    RequestResponse.askForKarmaResult(MainPlayer, mysteryLady, karmaOptions1);
    Wait.oneSecTrue();
    mysteryLady.speak("On to the second question.");
    mysteryLady.speak("What about grapefruit? You like that stuff?");
    ReputationOption[] karmaOptions2 = new ReputationOption[5];
    karmaOptions2[0] =
        new ReputationOption("Yeah, and I'd love to \"grapefruit\" you!", 30, "Oh boy!");
    karmaOptions2[1] = new ReputationOption("I'd eat it if I had to.", 1, "Same.");
    karmaOptions2[2] =
        new ReputationOption("Grapefruit. It is a Fruit.", 0, "...Uh, That it is....");
    karmaOptions2[3] = new ReputationOption("Gross...", -4, "Oh, sorry I asked.");
    karmaOptions2[4] = new ReputationOption("I hope you choke on grapefruit! *BITCH-SLAP*.", -10,
        "OW! WHAT THE HECKERS!");
    RequestResponse.askForKarmaResult(MainPlayer, mysteryLady, karmaOptions2);
    Wait.oneSecTrue();
    System.out.println(MainPlayer.getKarma());


  }// ends section1

  public static void randomIntegrationWithNoUseYet() {

    // Random .equals and == (still need to have a purpose to implement one)..
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


    // ARRAY STUFF//////////////////////////////////////////////////////////////////////////////////
    int[] randomArray = {1, 2, 300, 4, 5, 60, 7, 80000, 9, 10};

    // this will print out the minimum value of the Array.
    minVal = randomArray[0];
    for (int i = 0; i < randomArray.length; i++) {
      if (minVal < randomArray[i]) {
        minVal = randomArray[i];
      }
    }
    System.out.println(minVal);

    // this will print out the Sum of the array.
    int Accumulator = 0;
    for (int i = 0; i < randomArray.length; i++) {
      Accumulator += randomArray[i];
    }
    System.out.println(Accumulator);

    // this will find the location of numToFind and print out the location of that data.
    int numToFind = 9;
    for (int i = 0; i < randomArray.length; i++) {
      if (numToFind == randomArray[i]) {
        System.out.println(
            "The Location of 'numToFind' was found at location number " + i + "  in the list.");
      } else {
        System.out.println("The 'numToFind' was not found.");
      }
    }

    // Multidimensional Array////////////
    int[][] MultiArray = new int[2][5];
    MultiArray[0][4] = 4;


  }// ends section2
}// ends chapter1
