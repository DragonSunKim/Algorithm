import java.math.BigInteger;
import java.util.Scanner;

// Coding By 김용선.

public class bronze3_2061 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        BigInteger K = new BigInteger(in.next());
        int L = in.nextInt();

        int min = 0;

        for (int i = L - 1; i > 1; i--) {

            if ((K.remainder(new BigInteger(Integer.toString(i)))) == BigInteger.ZERO) {
                min = i;
            }
        }

        if (min == 0)
            System.out.println("GOOD");
        else
            System.out.println("BAD " + min);
    }
}
