package tools;

import java.util.Random;

public class ageGen {
 
  public static int randomAge() {
    Random rnd = new Random();
    int low = 3000;
    int high = 4000;
    int result = rnd.nextInt(high-low) + low;
    return result;
  }

}
