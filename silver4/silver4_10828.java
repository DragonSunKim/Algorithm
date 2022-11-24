import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

// Coding By 김용선.

public class silver4_10828 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        Stack<Integer> stack = new Stack<>();

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String s = br.readLine();

            if (s.equals("top")) {
                if (stack.empty())
                    bw.write("-1\n");
                else
                    bw.write(Integer.toString(stack.lastElement()) + "\n");
            }

            else if (s.equals("pop")) {
                if (stack.empty())
                    bw.write("-1\n");
                else
                    bw.write(Integer.toString(stack.pop()) + "\n");
            }

            else if (s.equals("size")) {
                bw.write(Integer.toString(stack.size()) + "\n");
            }

            else if (s.equals("empty")) {
                if (stack.empty())
                    bw.write("1\n");
                else
                    bw.write("0\n");
            }

            else {
                st = new StringTokenizer(s);
                st.nextToken();
                stack.push(Integer.parseInt(st.nextToken()));
            }
        }
        bw.flush();
        bw.close();
    }
}
