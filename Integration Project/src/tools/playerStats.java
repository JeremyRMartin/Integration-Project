package tools;

/*
 * "PLAYERSTATS" CLASS DESCRIPTION: 
 * This class is to Store player stats for later use
 * 
 */

public class playerStats {

  ////////////////// Fields///////////////////////////
  private static String name;
  private static double height;
  private static int age;
  private static boolean living;
  // ((((Height and age remain unused!!))))

  ////////////////// Methods/////////////////////////
  /////////// name
  public static void setName(String nameEntry) {
    name = nameEntry;
  }

  public static String getName() {
    return name;
  }

  /////////// height
  public static void setheight(double heightEntry) {
    height = heightEntry;
  }

  public static double getHeight() {
    return height;
  }

  ///////////// age
  public static void setAge(int ageEntry) {
    age = ageEntry;
  }

  public static int getAge() {
    return age;
  }

  ///////////// living
  public static void setLiving(Boolean livingEntry) {
    living = livingEntry;
  }

  public static boolean getLiving() {
    return living;
  }



}// end of playerStats
