import java.util.Scanner;

// Coding By 김용선.

public class bronze2_2789 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String input = in.next();
        String[] array = { "C", "A", "M", "B", "R", "I", "D", "G", "E" };
        String output = "";
        int x;
        for (int i = 0; i < input.length(); i++) {
            x = 0;
            for (int j = 0; j < array.length; j++) {
                if (input.substring(i, i + 1).equals(array[j]))
                    x = 1;
            }
            if (x == 0)
                output += input.substring(i, i + 1);
        }

        System.out.println(output);
    }
}
