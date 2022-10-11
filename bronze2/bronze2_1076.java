import java.util.Map;
import java.util.Scanner;

// Coding By 김용선.

public class bronze2_1076 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        Map<String, Integer> cal1 = Map.of("black", 0, "brown", 1, "red", 2, "orange", 3, "yellow", 4, "green", 5,
                "blue", 6, "violet", 7, "grey", 8, "white", 9);
        Map<String, Integer> cal2 = Map.of("black", 1, "brown", 10, "red", 100, "orange", 1000, "yellow", 10000,
                "green", 100000, "blue", 1000000, "violet", 10000000, "grey", 100000000, "white", 1000000000);

        String n1 = Integer.toString(cal1.get(in.next()));
        String n2 = Integer.toString(cal1.get(in.next()));

        long output = Long.parseLong(n1 + n2) * cal2.get(in.next());

        System.out.println(output);
    }
}
