import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

// Coding By 김용선.
// 스도쿠 최종
public class gold4_2580 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] rule = { "1", "2", "3", "4", "5", "6", "7", "8", "9" };
        List<String> rule2;
        String[][] array = new String[9][9]; // 9X9판 생성

        for (int i = 0; i < 9; i++) { // 데이터 삽입
            array[i] = in.nextLine().split(" ");
        }

        int x = -1;
        int y = -1;
        int breakpoint;
        while (true) {
            breakpoint = 0;
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {

                    if (array[i][j].equals("0")) {
                        rule2 = new ArrayList<>(Arrays.asList(rule));

                        for (int m = 0; m < 9; m++) {
                            rule2.remove(array[i][m]);
                        }
                        for (int n = 0; n < 9; n++) {
                            rule2.remove(array[n][j]);
                        }

                        if (i >= 0 && i <= 2 && j >= 0 && j <= 2) {
                            x = 2;
                            y = 2;
                        } else if (i >= 0 && i <= 2 && j >= 3 && j <= 5) {
                            x = 2;
                            y = 5;
                        } else if (i >= 0 && i <= 2 && j >= 6 && j <= 8) {
                            x = 2;
                            y = 8;
                        }

                        else if (i >= 3 && i <= 5 && j >= 0 && j <= 2) {
                            x = 5;
                            y = 2;
                        } else if (i >= 3 && i <= 5 && j >= 3 && j <= 5) {
                            x = 5;
                            y = 5;
                        } else if (i >= 3 && i <= 5 && j >= 6 && j <= 8) {
                            x = 5;
                            y = 8;
                        }

                        else if (i >= 6 && i <= 8 && j >= 0 && j <= 2) {
                            x = 8;
                            y = 2;
                        } else if (i >= 6 && i <= 8 && j >= 3 && j <= 5) {
                            x = 8;
                            y = 5;
                        } else if (i >= 6 && i <= 8 && j >= 6 && j <= 8) {
                            x = 8;
                            y = 8;
                        }

                        for (int p = x - 2; p <= x; p++) {
                            for (int q = y - 2; q <= y; q++) {
                                rule2.remove(array[p][q]);
                            }
                        }

                        if (rule2.size() == 1)
                            array[i][j] = rule2.get(0);
                    }
                }
            }
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    if (array[i][j].equals("0"))
                        breakpoint = -1;
                }
            }
            if (breakpoint == 0)
                break;
        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}