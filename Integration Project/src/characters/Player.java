package characters;

/*
 *The benefits of extending to the parent class allows this
 *"player" class to adopt all of the methods previously 
 *predefined in the super class. 
 */

public class Player extends Person {

  ///////////////// Fields////////////////////////
  //all fields are defined in the parent class of "Person.java

  ///////////////// Methods///////////////////////
  //// overloaded constructor////
  public Player(double health, boolean living) {
    super.setHealth(health);
    super.setLiving(living);
  }

//Overwritten Method
  @Override 
  public void speak(String dialog) {
    String whatToSay = dialog + " - [" + this.getName() + "]";
    System.out.printf("%87s", whatToSay);
    System.out.println();
    System.out.println();
  }// ends speak
}