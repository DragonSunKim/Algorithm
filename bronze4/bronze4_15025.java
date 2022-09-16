import java.util.Scanner;

public class bronze4_15025 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int l = in.nextInt();
        int r = in.nextInt();

        if (l == 0 && r == 0) {
            System.out.print("Not a moose");
        } else if (l == r) {
            System.out.printf("Even %d", l + r);
        } else {
            if (l > r) {
                System.out.printf("Odd %d", l * 2);
            } else {
                System.out.printf("Odd %d", r * 2);
            }
        }
    }
}
