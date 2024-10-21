package codingames.puzzles.easy;

import java.util.HashMap;
import java.util.Scanner;

/**
 * https://www.codingame.com/training/easy/mime-type
 */
public class MimeType {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int Q = in.nextInt();
        HashMap<String, String> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            String EXT = in.next(); // file extension
            String MT = in.next(); // MIME type.
            map.putIfAbsent(EXT.toLowerCase(), MT);
        }
        in.nextLine();
        for (int i = 0; i < Q; i++) {
            String FNAME = in.nextLine(); // One file name per line.
            String extension = "";
            int dotIndex = FNAME.lastIndexOf(".");
            if (dotIndex >= 0) {
                extension = FNAME.substring(dotIndex + 1);
            }
            String result = map.getOrDefault(extension.toLowerCase(), "UNKNOWN");
            System.out.println(result);
        }
    }
}
