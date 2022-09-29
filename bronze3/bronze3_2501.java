import java.util.ArrayList;
import java.util.Scanner;

// Coding By 김용선.

public class bronze3_2501 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int K = in.nextInt();

        ArrayList<Integer> array = new ArrayList<>();

        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                array.add(i);
            }
        }

        if (K > array.size())
            System.out.println(0);
        else
            System.out.println(array.get(K - 1));
    }
}
