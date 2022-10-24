import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// Coding By 김용선.

public class silver5_2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = bf.readLine();

        input = input.replaceAll("c=", "0");
        input = input.replaceAll("c-", "0");
        input = input.replaceAll("dz=", "0");
        input = input.replaceAll("d-", "0");
        input = input.replaceAll("lj", "0");
        input = input.replaceAll("nj", "0");
        input = input.replaceAll("s=", "0");
        input = input.replaceAll("z=", "0");
        bw.write(Integer.toString(input.length()));
        bw.flush();
        bw.close();
    }

}
