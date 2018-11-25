package characters;

public class Narrator extends Person {
  ///////////////// Fields////////////////////////
  // all fields are defined in the parent class of "Person.java

  ///////////////// Methods///////////////////////
  public Narrator() {

  }

  // Overwritten Method
  @Override
  public void speak(String dialog) {
    int lengthOfDialog = dialog.length();
    int spacesToAdd = Math.round((87 - lengthOfDialog) / 2);
    for (int j = 0; j < spacesToAdd; j++) {
      System.out.printf(" ");
    }
    System.out.println(dialog);
  } // end Formatting
}// ends speak

