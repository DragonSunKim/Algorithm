import java.util.Scanner;

// Coding By 김용선.

public class bronze2_5355 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int T = in.nextInt();
        in.nextLine();
        String[] s;
        double output;
        for (int i = 0; i < T; i++) {
            s = in.nextLine().split(" ");
            output = Double.parseDouble(s[0]);
            for (int j = 1; j < s.length; j++) {
                if (s[j].equals("@"))
                    output *= 3;
                else if (s[j].equals("%"))
                    output += 5;
                else if (s[j].equals("#"))
                    output -= 7;
            }
            System.out.printf("%.2f\n", output);
        }
    }
}
