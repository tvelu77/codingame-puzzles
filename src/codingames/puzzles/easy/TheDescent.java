package codingames.puzzles.easy;

import java.util.Scanner;

/**
 * https://www.codingame.com/training/easy/the-descent
 */
public class TheDescent {
  
  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    // game loop
    while (true) {
      var highest = 0;
      var index = -1;
      for (int i = 0; i < 8; i++) {
        int mountainH = in.nextInt(); // represents the height of one mountain.
        if (mountainH > highest) {
          highest = mountainH;
          index = i;
        }
      }
      System.out.println(index);
      // Write an action using System.out.println()
      // To debug: System.err.println("Debug messages...");
    }
  }
}
