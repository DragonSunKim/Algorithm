import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;

// Coding By 김용선.

public class silver5_2161 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        Queue<Integer> queue = new LinkedList<>();
        int[] array = new int[N];
        for (int i = 1; i <= N; i++) {
            queue.offer(i);
        }

        for (int i = 0; i < N; i++) {
            array[i] = queue.poll();
            queue.offer(queue.poll());
        }

        String s = "";
        for (int i = 0; i < N; i++) {
            s += array[i] + " ";
        }
        s = s.trim();

        bw.write(s);
        bw.flush();
        bw.close();
    }
}
