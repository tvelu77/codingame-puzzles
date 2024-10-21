package codingames.puzzles.medium;

import java.util.Scanner;

/**
 * https://www.codingame.com/training/medium/shadows-of-the-knight-episode-1
 */
public class ShadowsOfTheKnightEpisodeOne {

  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    int W = in.nextInt(); // width of the building.
    int H = in.nextInt(); // height of the building.
    int N = in.nextInt(); // maximum number of turns before game over.
    int X0 = in.nextInt();
    int Y0 = in.nextInt();
    var batmanX = X0;
    var batmanY = Y0;
    var heightMin = H;
    var heightMax = 0;
    var widthMin = 0;
    var widthMax = W;

    // game loop
    while (true) {
      String bombDir = in.next(); // the direction of the bombs from batman's current location (U, UR, R, DR, D,
                                  // DL, L or UL)
      switch (bombDir) {
      case "U":
        heightMin = batmanY;
        batmanY = (heightMin + heightMax) / 2;
        break;
      case "UR":
        heightMin = batmanY;
        widthMin = batmanX;
        batmanY = (heightMin + heightMax) / 2;
        batmanX = (widthMin + widthMax) / 2;
        break;
      case "UL":
        heightMin = batmanY;
        widthMax = batmanX;
        batmanY = (heightMin + heightMax) / 2;
        batmanX = (widthMin + widthMax) / 2;
        break;
      case "L":
        widthMax = batmanX;
        batmanX = (widthMin + widthMax) / 2;
        break;
      case "R":
        widthMin = batmanX;
        batmanX = (widthMin + widthMax) / 2;
        break;
      case "D":
        heightMax = batmanY;
        batmanY = (heightMin + heightMax) / 2;
        break;
      case "DR":
        heightMax = batmanY;
        widthMin = batmanX;
        batmanY = (heightMin + heightMax) / 2;
        batmanX = (widthMin + widthMax) / 2;
        break;
      case "DL":
        heightMax = batmanY;
        widthMax = batmanX;
        batmanY = (heightMin + heightMax) / 2;
        batmanX = (widthMin + widthMax) / 2;
        break;
      default:
        break;
      }

      // Write an action using System.out.println()
      // To debug: System.err.println("Debug messages...");

      // the location of the next window Batman should jump to.
      System.out.println(batmanX + " " + batmanY);
    }
  }
}
