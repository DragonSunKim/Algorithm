import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

// Coding By 김용선.

public class bronze2_2592 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        List<Integer> array = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            array.add(in.nextInt());
            sum += array.get(i);
        }
        System.out.printf("%d\n", sum / 10);
        Set<Integer> set = new HashSet<>(array);

        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int n : set) {
            count = 0;
            for (int o : array) {
                if (n == o) {
                    count += 1;
                }
            }
            map.put(n, count);
        }
        int max = -1;
        int max_key = -1;
        for (int n : map.keySet()) {
            if (map.get(n) > max) {
                max = map.get(n);
                max_key = n;
            }
        }
        System.out.println(max_key);
    }
}
