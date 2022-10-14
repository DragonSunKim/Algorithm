import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

// Coding By 김용선.

public class bronze2_2605 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= N; i++) {
            list.add(in.nextInt(), i);
        }

        Collections.reverse(list);
        String s = "";
        for (Integer i : list)
            s += (i + " ");

        s = s.trim();
        System.out.println(s);
    }
}
