import java.util.ArrayList;
import java.util.Scanner;

// Coding By 김용선.

public class silver5_9625 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int K = in.nextInt();

        ArrayList<int[]> list = new ArrayList<>();
        if (K == 1)
            System.out.println(0 + " " + 1);
        else if (K == 2)
            System.out.println(1 + " " + 1);
        else {
            list.add(new int[] { 0, 1 });
            list.add(new int[] { 1, 1 });
            for (int i = 2; i < K; i++) {
                list.add(
                        new int[] { list.get(i - 2)[0] + list.get(i - 1)[0], list.get(i - 2)[1] + list.get(i - 1)[1] });

            }
            System.out.printf("%d %d", list.get(K - 1)[0], list.get(K - 1)[1]);
        }

    }
}
