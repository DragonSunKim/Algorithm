import java.util.Scanner;

public class bronze4_14489 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int A = in.nextInt();
        int B = in.nextInt();
        int C = in.nextInt();

        if ((A + B) >= (C * 2)) {
            System.out.print((A + B) - (C * 2));
        } else {
            System.out.print(A + B);
        }

    }
}