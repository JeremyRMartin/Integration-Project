package tools;

import java.util.InputMismatchException;
import characters.Person;

public class TestInputForException {

  public static void StringTest() {
    boolean gottonGoodInput = false;
    while (gottonGoodInput == false) {
      try {

      } catch (Exception ex) {

      }
    }
  }// ends StringTest

  public static int IntTest(Person mysteryLady) {
    boolean gottonGoodInput = false;
    int response = 0;
    while (gottonGoodInput == false) {
      try {
        response = Utility.scanner.nextInt();
        Utility.scanner.nextLine();
        gottonGoodInput = true;
      } catch (InputMismatchException ex) {
        mysteryLady.speak("That's not a Number. Try Again.");
        gottonGoodInput = true;
      }
    }
    return response;
  }// ends IntTest

  // public static String yesNoTest(String response) {
  // String[] legalResponses = {"YES","NO"};
  // boolean gottonGoodInput = false;
  // while (gottonGoodInput == false) {
  // try {
  // if (response.equals(legalResponses[0])) {
  // gottonGoodInput = true;
  // }else if(response.equals(legalResponses[1])) {
  // gottonGoodInput = true;
  // }else {
  // throw new IndexOutOfBoundsException("PLEASE CHOOSE AN OPTION FROM ABOVE!");
  // }
  // } catch (IndexOutOfBoundsException ex) {
  // System.out.println(ex.getMessage());
  // response = Utility.scanner.nextLine();
  // response = response.toUpperCase();
  // }//ends catch
  // }//ends while
  // return response;
  // }// ends YesNoTest


}// ends TestInputForException
