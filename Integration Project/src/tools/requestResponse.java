package tools;

/*"STRINGRESPONSE" CLASS DESCRIPTION:
 * This tool is used to request and return a response to an NPC. 
 * 
 */


public class requestResponse {


  public static String yesNoMore() {
    System.out.println("------------------------------------------");
    System.out.println("	***TYPE YOUR RESPONSE***		");
    System.out.printf("%19s%5s%n", "(Yes)", "(No)");
    System.out.printf("%25s%n", "(More Info)");
    System.out.println("------------------------------------------");
    String response = Utility.scanner.nextLine();
    response = response.toUpperCase();
    return response;
  }// end yesNoMore method


  public static String yesNo() {
    System.out.println("------------------------------------------");
    System.out.println("	***TYPE YOUR RESPONSE***		");
    System.out.printf("%19s%5s%n", "(Yes)", "(No)");
    System.out.println("------------------------------------------");
    String response = Utility.scanner.nextLine();
    response = response.toUpperCase();
    return response;

  }// end yesNo

  public static String askForString() {
    System.out.println("------------------------------------------");
    System.out.println("	***TYPE YOUR RESPONSE***		");
    System.out.println("------------------------------------------");
    String response = Utility.scanner.nextLine();
    return response;
  }//end askForString
  
  public static String askForNameEntry() throws InterruptedException {
    System.out.println("------------------------------------------");
    System.out.println("    ***TYPE YOUR RESPONSE***        ");
    System.out.println("------------------------------------------");
    String nameEntry = Utility.scanner.nextLine();
    playerStats.setName(testNameForCorrect.CorrectName(nameEntry));
    return nameEntry;
  }//end askForNameEntry
  
  public static int askForInt() throws InterruptedException {
    System.out.println("------------------------------------------");
    System.out.println("    ***TYPE YOUR RESPONSE***        ");
    System.out.println("------------------------------------------");
    int response = Utility.scanner.nextInt();
    playerStats.setAge(response);
    return response;
  }
}
