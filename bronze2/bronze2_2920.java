import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// Coding By 김용선.

public class bronze2_2920 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] array = bf.readLine().split(" ");

        String[] array_asc = { "1", "2", "3", "4", "5", "6", "7", "8" };

        String[] array_desc = { "8", "7", "6", "5", "4", "3", "2", "1" };

        int count_asc = 0;
        int count_desc = 0;
        for (int i = 0; i < 8; i++) {
            if (array[i].equals(array_asc[i]))
                count_asc += 1;
            else if (array[i].equals(array_desc[i]))
                count_desc += 1;
        }

        if (count_asc == 8)
            bw.write("ascending");
        else if (count_desc == 8)
            bw.write("descending");
        else
            bw.write("mixed");
        bw.flush();
        bw.close();
    }
}
