package codingames.puzzles.easy;

import java.util.Scanner;

/**
 * https://www.codingame.com/training/easy/temperatures
 */
public class Temperatures {
  
  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt(); // the number of temperatures to analyse
    int lowest = Integer.MAX_VALUE;
    for (int i = 0; i < n; i++) {
      int t = in.nextInt(); // a temperature expressed as an integer ranging from -273 to 5526
      int currentTemp = Math.abs(t);
      if (currentTemp < Math.abs(lowest)) {
        lowest = t;
      } else if (currentTemp == Math.abs(lowest)) {
        lowest = t > 0 ? t : lowest;
      }
    }

    // Write an answer using System.out.println()
    // To debug: System.err.println("Debug messages...");

    System.out.println(lowest == Integer.MAX_VALUE ? 0 : lowest);
  }
}
