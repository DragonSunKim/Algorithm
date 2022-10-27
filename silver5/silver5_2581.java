import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

// Coding By 김용선.

public class silver5_2581 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());

        int x;

        List<Integer> list = new ArrayList<>();
        for (int i = M; i <= N; i++) {
            x = 1;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    x = -1;
                }
            }
            if (x == 1 && i != 1) {
                list.add(i);
            }
        }

        if (list.isEmpty() == true)
            bw.write("-1");
        else {
            bw.write(Integer.toString(list.stream().mapToInt(i -> i).sum()) + "\n");
            bw.write(Integer.toString(list.stream().mapToInt(i -> i).min().getAsInt()));
        }

        bw.flush();
        bw.close();
    }
}
