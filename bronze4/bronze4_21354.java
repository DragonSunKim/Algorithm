import java.util.Scanner;

// Coding By 김용선.

public class bronze4_21354 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int A = in.nextInt();
        int P = in.nextInt();

        if (A * 7 > P * 13)
            System.out.println("Axel");
        else if (A * 7 < P * 13)
            System.out.println("Petra");
        else if (A * 7 == P * 13)
            System.out.println("lika");
    }
}
