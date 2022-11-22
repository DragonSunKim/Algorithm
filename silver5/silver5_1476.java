import java.util.Scanner;

// Coding By 김용선.

public class silver5_1476 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        byte E = in.nextByte();
        byte S = in.nextByte();
        byte M = in.nextByte();

        byte E_input = 0;
        byte S_input = 0;
        byte M_input = 0;
        int ans = 0;
        while (!(E_input == E && S_input == S && M_input == M)) {
            E_input++;
            S_input++;
            M_input++;
            ans++;
            if (E_input > 15)
                E_input = 1;
            if (S_input > 28)
                S_input = 1;
            if (M_input > 19)
                M_input = 1;
        }
        System.out.println(ans);
        in.close();
    }
}
