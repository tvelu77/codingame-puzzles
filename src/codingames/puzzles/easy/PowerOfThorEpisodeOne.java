package codingames.puzzles.easy;

import java.util.Scanner;

/**
 * https://www.codingame.com/training/easy/power-of-thor-episode-1
 */
public class PowerOfThorEpisodeOne {

  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    int lightX = in.nextInt(); // the X position of the light of power
    int lightY = in.nextInt(); // the Y position of the light of power
    int initialTx = in.nextInt(); // Thor's starting X position
    int initialTy = in.nextInt(); // Thor's starting Y position

    // game loop
    while (true) {
      var direction = "";
      int remainingTurns = in.nextInt(); // The remaining amount of turns Thor can move. Do not remove this line.
      if (lightY > initialTy) {
        initialTy += 1;
        direction += "S";
      } else if (lightY < initialTy) {
        initialTy -= 1;
        direction += "N";
      }
      if (lightX > initialTx) {
        initialTx += 1;
        direction += "E";
      } else if (lightX < initialTx) {
        initialTx -= 1;
        direction += "W";
      }
      // Write an action using System.out.println()
      // To debug: System.err.println("Debug messages...");

      // A single line providing the move to be made: N NE E SE S SW W or NW
      System.out.println(direction);
    }
  }
}
