package tools;

import java.util.Random;

public class ageGen {
 
  public static int randomAge() {
    Random rnd = new Random();
    int low = 120;
    int high = 1000;
    int result = rnd.nextInt(high-low) + low;
    return result;
  }

}
