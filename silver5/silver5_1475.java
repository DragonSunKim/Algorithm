import java.util.ArrayList;
import java.util.Scanner;

// Coding By 김용선.

public class silver5_1475 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String N = in.next();

        ArrayList<String> list = new ArrayList<>();

        list.add("0");
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");
        list.add("6");
        list.add("7");
        list.add("8");

        ArrayList<String> list_clone = (ArrayList<String>) list.clone();

        int ans = 1;

        for (int i = 0; i < N.length(); i++) {
            if (N.substring(i, i + 1).equals("6") || N.substring(i, i + 1).equals("9")) {
                if (list_clone.contains("6"))
                    list_clone.remove("6");
                else {
                    list_clone.addAll(list);
                    list_clone.remove("6");
                    ans++;
                }
            } else {
                if (list_clone.contains(N.substring(i, i + 1)))
                    list_clone.remove(N.substring(i, i + 1));
                else {
                    list_clone.addAll(list);
                    list_clone.remove(N.substring(i, i + 1));
                    ans++;
                }
            }
        }
        System.out.println(ans);
        in.close();
    }
}
