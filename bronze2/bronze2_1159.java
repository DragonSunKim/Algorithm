import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

// Coding By 김용선.

public class bronze2_1159 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        List<String> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            list.add(in.next().substring(0, 1));
        }

        HashSet<String> set = new HashSet<>(list);

        List<String> list2 = new ArrayList<>(set);
        Collections.sort(list2);
        int x = 0;
        for (String s : list2) {
            if (Collections.frequency(list, s) >= 5) {
                System.out.print(s);
                x = 1;
            }
        }
        if (x == 0)
            System.out.print("PREDAJA");

    }
}
