import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

// Coding By 김용선.

public class silver5_2167 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();

        StringTokenizer st = new StringTokenizer(s);

        short N = Short.parseShort(st.nextToken());
        short M = Short.parseShort(st.nextToken());

        short[][] array = new short[N][M];

        for (int i = 0; i < N; i++) {
            s = br.readLine();
            st = new StringTokenizer(s);
            for (int j = 0; j < M; j++) {
                array[i][j] = Short.parseShort(st.nextToken());
            }
        }

        short K = Short.parseShort(br.readLine());

        short i, j, x, y;
        int sum;
        for (int l = 0; l < K; l++) {
            sum = 0;
            s = br.readLine();
            st = new StringTokenizer(s);
            i = Short.parseShort(st.nextToken());
            j = Short.parseShort(st.nextToken());
            x = Short.parseShort(st.nextToken());
            y = Short.parseShort(st.nextToken());

            for (int a = i - 1; a < x; a++) {
                for (int b = j - 1; b < y; b++) {
                    sum += array[a][b];
                }
            }

            bw.write(Integer.toString(sum) + "\n");
        }
        bw.flush();
        bw.close();
    }
}
