import java.util.Scanner;

public class bronze4_21591 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int wc = in.nextInt();
        int hc = in.nextInt();
        int ws = in.nextInt();
        int hs = in.nextInt();

        int w_dif = wc - ws;
        int h_dif = hc - hs;

        if (w_dif >= 2 && h_dif >= 2)
            System.out.println(1);
        else
            System.out.println(0);
    }
}
