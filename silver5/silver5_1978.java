import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// Coding By 김용선.

public class silver5_1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(bf.readLine());
        String s = bf.readLine();

        String[] s_array = s.split(" ");

        int count;
        int result = 0;
        for (int i = 0; i < s_array.length; i++) {
            count = 0;
            int a = Integer.parseInt(s_array[i]);
            for (int j = 1; j <= a; j++) {
                if (a % j == 0)
                    count++;
            }
            if (count == 2)
                result++;
        }

        System.out.println(result);
    }
}
