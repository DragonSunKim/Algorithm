import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Iterator;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

// Coding By 김용선.

public class silver5_10867 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Set<Integer> set = new TreeSet<Integer>();

        int N = Integer.parseInt(br.readLine());

        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s);
        for (int i = 0; i < N; i++) {
            set.add(Integer.parseInt(st.nextToken()));
        }

        Iterator<Integer> it = set.iterator();
        s = "";
        while (it.hasNext()) {
            s += Integer.toString(it.next()) + " ";
        }
        s = s.trim();
        bw.write(s);
        bw.flush();
        bw.close();
    }
}
