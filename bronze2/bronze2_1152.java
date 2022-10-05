import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

// Coding By 김용선.

public class bronze2_1152 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String s = in.nextLine();

        List<String> list = Arrays.asList(s.split(" "));
        List<String> s_array = new ArrayList<>(list);

        s_array.remove("");

        System.out.println(s_array.size());
    }
}