import java.util.Scanner;

public class bronze4_14581 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fan = ":fan:";
        String id = in.nextLine();
        id = ":" + id + ":";

        System.out.printf("%s%s%s\n", fan, fan, fan);
        System.out.printf("%s%s%s\n", fan, id, fan);
        System.out.printf("%s%s%s", fan, fan, fan);

    }
}
