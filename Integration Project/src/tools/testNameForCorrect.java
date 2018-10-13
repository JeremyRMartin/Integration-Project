package tools;

/*"TESTNAME" CLASS DESCRIPTION:
 * This tool is used to test a users response to PLAYERNAME,
 * 
 * it will prompt asking for error in PLAYERNAME and return,
 * 
 * a CORRECTNAME. 
 */

public class testNameForCorrect {

  public static String CorrectName(String name) throws InterruptedException {
    name = formatNameString.Format(name);
    System.out.println("[Old Man]- " + name + ", really?");
    wait.oneSec();
    System.out.println("[Old Man]- Did I get that right?");
    String response = requestResponse.yesNo();

    if (response.equals("NO")) {
      System.out.println("[Old Man]- Okay, what is it then?");
      name = requestResponse.askForString();
    } else if (response.equals("YES")) {
      // Break if "YES"
    } else {
      System.out.println("PLEASE ENTER A CORRECT OPTION");
      name = Utility.scanner.nextLine();
    }
    name = formatNameString.Format(name);
    playerStats.setName(name);
    return name;
  }
}
