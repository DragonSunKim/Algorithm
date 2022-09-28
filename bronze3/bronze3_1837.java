import java.math.BigInteger;
import java.util.Scanner;

// Coding By 김용선.

public class bronze3_1837 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        BigInteger P = new BigInteger(in.next());
        int K = in.nextInt();

        int min = 0;
        BigInteger Big_i;
        for (int i = K - 1; i > 1; i--) {
            Big_i = new BigInteger(Integer.toString(i));
            if ((P.remainder(Big_i)) == BigInteger.ZERO) {
                min = i;
            }
        }

        if (min == 0)
            System.out.println("GOOD");
        else
            System.out.println("BAD " + min);

    }
}
