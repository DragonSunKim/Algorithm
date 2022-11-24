import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

// Coding By 김용선.

public class silver4_9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Stack<String> stack = new Stack<>();

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {

            String input = br.readLine();
            int c = 1;
            for (int j = 0; j < input.length(); j++) {
                if (input.substring(j, j + 1).equals("(")) {
                    stack.push("(");
                } else if (input.substring(j, j + 1).equals(")")) {
                    if (!stack.empty())
                        stack.pop();
                    else {
                        c = -1;
                        break;
                    }
                }
            }

            if (c == 1 && stack.empty())
                bw.write("YES\n");
            else if (c == -1 || !stack.empty())
                bw.write("NO\n");

            stack.clear();
        }
        bw.flush();
        bw.close();
    }
}