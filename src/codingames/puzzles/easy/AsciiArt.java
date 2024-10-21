package codingames.puzzles.easy;

import java.util.Scanner;

/**
 * https://www.codingame.com/training/easy/ascii-art
 */
public class AsciiArt {

  private record Range(int start, int end) {
  }

  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    int L = in.nextInt();
    int H = in.nextInt();
    if (in.hasNextLine()) {
      in.nextLine();
    }
    StringBuilder sb = new StringBuilder();
    String T = in.nextLine().toLowerCase();
    Range rangeInAlphabet[] = new Range[T.length()];
    for (int i = 0; i < T.length(); i++) {
      int start = (T.charAt(i) - 'a') * L;
      rangeInAlphabet[i] = new Range(start, start + L);
    }
    for (int i = 0; i < H; i++) {
      String ROW = in.nextLine();
      for (Range range : rangeInAlphabet) {
        if (range.start() >= 26 * L || range.start() < 0 || range.end() < 0) {
          for (int j = 26 * L; j < (26 * L) + L; j++) {
            sb.append(ROW.charAt(j));
          }
        } else {
          for (int j = range.start(); j < range.end(); j++) {
            sb.append(ROW.charAt(j));
          }
        }
      }
      sb.append("\n");
    }

    // Write an answer using System.out.println()
    // To debug: System.err.println("Debug messages...");

    System.out.println(sb.toString());
  }
}
