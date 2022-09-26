import java.math.BigInteger;
import java.util.Scanner;

// Coding By 김용선

public class bronze3_1247 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N;

        BigInteger sum;
        BigInteger n;
        for (int i = 0; i < 3; i++) {
            N = in.nextInt();
            in.nextLine();
            sum = new BigInteger("0");
            for (int j = 0; j < N; j++) {
                n = new BigInteger(in.nextLine());
                sum = sum.add(n);
            }
            if (sum.toString().equals("0"))
                System.out.println(0);
            else if (sum.toString().substring(0, 1).equals("-"))
                System.out.println("-");
            else
                System.out.println("+");
        }
    }
}
