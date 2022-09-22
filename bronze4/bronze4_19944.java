import java.util.Scanner;

// Coding By 김용선.

public class bronze4_19944 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int M = in.nextInt();

        if (M == 1 || M == 2)
            System.out.println("NEWBIE!");
        else if (M > 2 && M <= N)
            System.out.println("OLDBIE!");
        else
            System.out.println("TLE!");

    }
}
