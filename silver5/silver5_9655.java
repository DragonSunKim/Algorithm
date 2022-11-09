import java.util.Scanner;

// Coding By 김용선.

public class silver5_9655 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        if (N % 2 == 1)
            System.out.println("SK");
        else
            System.out.println("CY");
    }
}
