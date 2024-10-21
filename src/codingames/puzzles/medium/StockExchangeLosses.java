package codingames.puzzles.medium;

import java.util.Scanner;

/**
 * https://www.codingame.com/training/medium/stock-exchange-losses
 */
public class StockExchangeLosses {
  
  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int maxLoss = 0;
    int firstValue = Integer.MIN_VALUE;
    int secondValue = Integer.MAX_VALUE;
    for (int i = 0; i < n; i++) {
      int v = in.nextInt();
      if (v > firstValue) {
        firstValue = v;
        secondValue = v;
      }
      if (v < secondValue) {
        secondValue = v;
      }
      int loss = secondValue - firstValue;
      if (loss < maxLoss) {
        maxLoss = loss;
      }
    }

    // Write an answer using System.out.println()
    // To debug: System.err.println("Debug messages...");
    System.out.println(maxLoss);
  }
}
