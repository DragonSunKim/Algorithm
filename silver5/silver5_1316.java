import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

// Coding By 김용선.

public class silver5_1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(bf.readLine());
        String s;
        String before;

        int x = 0;
        int count = 0;
        for (int i = 0; i < N; i++) {
            s = bf.readLine();
            before = "";
            x = 1;
            List<String> list = new ArrayList<>();
            for (int j = 0; j < s.length(); j++) {
                if (!(list.contains(s.substring(j, j + 1))))
                    list.add(s.substring(j, j + 1));
                else if (list.contains(s.substring(j, j + 1))) {
                    if (!(s.substring(j, j + 1).equals(before))) {
                        x = -1;
                        break;
                    }
                }
                before = s.substring(j, j + 1);

            }
            if (x == 1)
                count++;
        }
        bw.write(Integer.toString(count));
        bw.flush();
        bw.close();
    }
}
