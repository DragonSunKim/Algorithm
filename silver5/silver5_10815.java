// Coding By 김용선.

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class silver5_10815 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int[] array1 = new int[N];
        String s = br.readLine();
        st = new StringTokenizer(s);

        for (int i = 0; i < N; i++) {
            array1[i] = Integer.parseInt(st.nextToken());
        }

        int M = Integer.parseInt(br.readLine());
        int[] array2 = new int[M];
        s = br.readLine();
        st = new StringTokenizer(s);

        for (int i = 0; i < M; i++) {
            array2[i] = Integer.parseInt(st.nextToken());
        }

        ArrayList<Integer> list = binarySearch(array1, array2);

        for (int x : list)
            sb.append(x + " ");

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    public static ArrayList<Integer> binarySearch(int[] array1, int[] array2) {
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(array1);
        int M = array2.length;

        for (int i = 0; i < M; i++) {
            int start = 0;
            int end = array1.length - 1;
            int mid = (start + end) / 2;
            int c = 0;
            while (end >= start) {
                if (array2[i] == array1[mid]) {
                    c = 1;
                    break;
                } else if (array2[i] > array1[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
                mid = (start + end) / 2;
            }
            list.add(c);
        }
        return list;
    }
}
