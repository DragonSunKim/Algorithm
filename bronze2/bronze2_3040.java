import java.util.Scanner;

public class bronze2_3040 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] t = new int[9];
        int[] m = new int[7];

        for (int i = 0; i < 9; i++) {
            t[i] = in.nextInt();
        }

        int sum = 0;
        for (int a = 0; a <= 2; a++) {
            for (int b = a + 1; b <= 3; b++) {
                for (int c = b + 1; c <= 4; c++) {
                    for (int d = c + 1; d <= 5; d++) {
                        for (int e = d + 1; e <= 6; e++) {
                            for (int f = e + 1; f <= 7; f++) {
                                for (int g = f + 1; g <= 8; g++) {
                                    sum += t[a];
                                    sum += t[b];
                                    sum += t[c];
                                    sum += t[d];
                                    sum += t[e];
                                    sum += t[f];
                                    sum += t[g];
                                    if (sum == 100) {
                                        m[0] = t[a];
                                        m[1] = t[b];
                                        m[2] = t[c];
                                        m[3] = t[d];
                                        m[4] = t[e];
                                        m[5] = t[f];
                                        m[6] = t[g];
                                    }
                                    sum = 0;
                                }
                            }
                        }
                    }
                }
            }
        }
        for (int k : m)
            System.out.println(k);
    }
}