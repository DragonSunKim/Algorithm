import java.util.Scanner;

// Coding By 김용선.

public class bronze2_5598 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String s = in.next();

        for (int i = 0; i < s.length(); i++) {
            if (s.substring(i, i + 1).equals("A"))
                System.out.print("X");
            else if (s.substring(i, i + 1).equals("B"))
                System.out.print("Y");
            else if (s.substring(i, i + 1).equals("C"))
                System.out.print("Z");
            else
                System.out.print((char) (s.substring(i, i + 1).charAt(0) - 3));
        }
    }
}
