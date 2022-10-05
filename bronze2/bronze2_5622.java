import java.util.Scanner;

// Coding By 김용선.

public class bronze2_5622 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String input = in.next();
        char a;
        int sum = 0;
        for (int i = 0; i < input.length(); i++) {
            a = input.substring(i, i + 1).charAt(0);
            if (a >= 'A' && a <= 'C')
                sum += 3;
            else if (a >= 'D' && a <= 'F')
                sum += 4;
            else if (a >= 'G' && a <= 'I')
                sum += 5;
            else if (a >= 'J' && a <= 'L')
                sum += 6;
            else if (a >= 'M' && a <= 'O')
                sum += 7;
            else if (a >= 'P' && a <= 'S')
                sum += 8;
            else if (a >= 'T' && a <= 'V')
                sum += 9;
            else if (a >= 'W' && a <= 'Z')
                sum += 10;
        }
        System.out.println(sum);
    }
}
