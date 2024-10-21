package codingames.puzzles.medium;

import java.util.Arrays;
import java.util.Scanner;

/**
 * https://www.codingame.com/training/medium/there-is-no-spoon-episode-1
 */
public class ThereIsNoSpoonEpisodeOne {

  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    int width = in.nextInt(); // the number of cells on the X axis
    int height = in.nextInt(); // the number of cells on the Y axis
    String right[][] = new String[height][width];
    String below[][] = new String[height][width];
    for (String[] row : right) {
      Arrays.fill(row, "-1 -1");
    }
    for (String[] row : below) {
      Arrays.fill(row, "-1 -1");
    }
    if (in.hasNextLine()) {
      in.nextLine();
    }
    for (int i = 0; i < height; i++) {
      String line = in.nextLine(); // width characters, each either 0 or .
      System.err.println(line);
      for (int j = 0; j < width; j++) {
        if (line.charAt(j) == '.') {
          right[i][j] = null;
          below[i][j] = null;
          if (j > 0) {
            for (int h = j - 1; h >= 0; h--) {
              if (right[i][h] != null) {
                right[i][h] = "-1 -1";
                break;
              }
            }
          }
          if (i > 0) {
            for (int h = i - 1; h >= 0; h--) {
              if (below[h][j] != null) {
                below[h][j] = "-1 -1";
                break;
              }
            }
          }
        } else {
          System.err.println("nothing for " + i + " " + j);
          if (j > 0) {
            for (int h = j - 1; h >= 0; h--) {
              if (right[i][h] != null) {
                right[i][h] = j + " " + i;
                break;
              }
            }
          }
          if (i > 0) {
            for (int h = i - 1; h >= 0; h--) {
              if (below[h][j] != null) {
                below[h][j] = j + " " + i;
                break;
              }
            }
          }
        }
      }
    }

    for (int i = 0; i < height; i++) {
      for (int j = 0; j < width; j++) {
        if (below[i][j] == null && right[i][j] == null) {
          continue;
        }
        System.out.println(j + " " + i + " " + right[i][j] + " " + below[i][j]);
      }
    }
  }
}