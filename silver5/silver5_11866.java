import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// Coding By 김용선.

public class silver5_11866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input);

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            queue.offer(i);
        }
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < K - 1; j++) {
                queue.offer(queue.poll());
            }
            array[i] = queue.poll();
        }
        String output = "<";

        for (int i = 0; i < N; i++) {
            if (i != N - 1)
                output += array[i] + ", ";
            else
                output += array[i] + ">";
        }
        bw.write(output);
        bw.flush();
        bw.close();
    }
}
