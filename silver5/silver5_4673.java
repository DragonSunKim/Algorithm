import java.util.ArrayList;
import java.util.List;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

// Coding By 김용선,

public class silver5_4673 {
    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        List<String> list = new ArrayList<>();

        for (int j = 1; j <= 10000; j++) {
            list.add(Integer.toString(j));
        }

        int m;
        String s;
        for (int i = 1; i < 10000; i++) {
            m = i;
            while (true) {
                s = Integer.toString(m);

                for (int j = 0; j < s.length(); j++) {
                    m += Integer.parseInt(s.substring(j, j + 1));
                }

                list.remove(Integer.toString(m));

                if (m > 10000)
                    break;
            }
        }
        for (String x : list) {
            bw.write(x + "\n");
        }
        bw.flush();
        bw.close();
    }
}
