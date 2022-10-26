import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Coding By 김용선.

public class silver5_1427 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            list.add(Integer.parseInt(s.substring(i, i + 1)));
        }

        Collections.sort(list, Collections.reverseOrder());

        for (int x : list)
            bw.write(Integer.toString(x));

        bw.flush();
        bw.close();
    }
}
