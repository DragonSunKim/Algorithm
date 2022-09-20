import java.util.Scanner;

public class bronze4_18198 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String s = in.nextLine();
        int sum_A = 0;
        int sum_B = 0;
        for (int i = 0; i < s.length(); i += 2) {
            if (s.substring(i, i + 1).equals("A"))
                sum_A += Integer.parseInt(s.substring(i + 1, i + 2));
            else if (s.substring(i, i + 1).equals("B"))
                sum_B += Integer.parseInt(s.substring(i + 1, i + 2));
        }

        if (sum_A > sum_B)
            System.out.print("A");
        else
            System.out.print("B");
    }
}
