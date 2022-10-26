import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

// Coding By 김용선.

public class silver5_7568 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());

        int[][] array = new int[N][2];

        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            st = new StringTokenizer(s);
            array[i][0] = Integer.parseInt(st.nextToken());
            array[i][1] = Integer.parseInt(st.nextToken());

        }
        int count;
        String output = "";
        for (int i = 0; i < N; i++) {
            count = 1;
            for (int j = 0; j < N; j++) {
                if (array[i][0] < array[j][0] && array[i][1] < array[j][1])
                    count++;
            }
            output += (count + " ");
        }
        output = output.trim();

        bw.write(output);
        bw.flush();
        bw.close();
    }
}
