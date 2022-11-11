import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

// Coding By 김용선.

public class silver5_2822 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            list.add(in.nextInt());
            list2.add(list.get(i));
        }

        Collections.sort(list2);
        int sum = list2.get(3) + list2.get(4) + list2.get(5) + list2.get(6) + list2.get(7);

        List<Integer> order = new ArrayList<>();

        for (int i = 3; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (list2.get(i) == list.get(j)) {
                    order.add(j + 1);
                }
            }
        }

        Collections.sort(order);
        System.out.println(sum);

        String s = "";
        for (int k : order)
            s += (k + " ");
        s = s.trim();

        System.out.print(s);
    }
}