import java.util.Scanner;

public class bronze4_18330 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int k = in.nextInt();
        int sum = 0;
        if ((k + 60 - n) >= 0)
            sum += (n) * 1500;
        else {
            sum += (k + 60) * 1500;
            sum += (n - k - 60) * 3000;
        }
        System.out.print(sum);
    }
}
