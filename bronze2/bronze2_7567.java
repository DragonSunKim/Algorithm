import java.util.ArrayList;
import java.util.Scanner;

// Coding By 김용선.

public class bronze2_7567 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String s = in.next();

        ArrayList<String> list = new ArrayList<>();

        list.add(s.substring(0, 1));
        int sum = 10;
        for (int i = 1; i < s.length(); i++) {
            list.add(s.substring(i, i + 1));
            if (list.get(i - 1).equals(list.get(i))) {
                sum += 5;
            } else {
                sum += 10;
            }

        }
        System.out.println(sum);
    }
}
