import java.util.Scanner;

// Coding By 김용선.

public class silver5_1436 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int x = 0;
        int ans = 0;
        for (int i = 666; i <= 2147483647; i++) {
            if (Integer.toString(i).contains("666")) {
                x++;
            }
            if (x == n) {
                ans = i;
                break;
            }
        }
        System.out.println(ans);
    }
}