package codingames.puzzles.easy;

import java.util.Scanner;

/**
 * https://www.codingame.com/training/easy/unary
 */
public class Unary {

  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    String MESSAGE = in.nextLine();
    char[] chars = MESSAGE.toCharArray();
    StringBuilder sb = new StringBuilder();
    for (char character : chars) {
      String binary = Integer.toBinaryString(character);
      String result = "";
      if (binary.length() < 7) {
        for (int i = 0; i < 7 - binary.length(); i++) {
          result += "0";
        }
      }
      sb.append(result + binary);
    }
    String binary = sb.toString();
    chars = binary.toCharArray();
    sb = new StringBuilder();
    char current = '2';
    for (char character : chars) {
      if (character != current && character == '0') {
        sb.append(" 00 ");
        current = character;
      } else if (character != current && character == '1') {
        sb.append(" 0 ");
        current = character;
      }
      sb.append('0');

    }

    // Write an answer using System.out.println()
    // To debug: System.err.println("Debug messages...");

    System.out.println(sb.toString().trim());
  }
}
