import java.util.Scanner;

public class bronze2_2864 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String A = in.next();
        String B = in.next();

        String a = A.replace("6", "5");
        String b = B.replace("6", "5");

        int min = Integer.parseInt(a) + Integer.parseInt(b);

        a = A.replace("5", "6");
        b = B.replace("5", "6");

        int max = Integer.parseInt(a) + Integer.parseInt(b);

        System.out.printf("%d %d", min, max);

    }
}
