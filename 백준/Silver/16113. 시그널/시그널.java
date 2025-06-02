import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String input = br.readLine();
        int col = n / 5;

        boolean[][] signal = new boolean[5][col];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < col; j++) {
                char c = input.charAt(i * col + j);
                if (c == '.') {
                    signal[i][j] = false;
                } else {
                    signal[i][j] = true;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < col; ) {
            if (colIsEmpty(signal, i)) {
                i++;
                continue;
            }
            if (colIsOne(signal, i, col)) {
                sb.append(1);
                i++;
                continue;
            }
            if (i < col - 2) {
                int cnt = cntOne(signal, i);
                int num = -1;
                switch (cnt) {
                    case 7: {
                        num = 7;
                        break;
                    }
                    case 9: {
                        num = 4;
                        break;
                    }
                    case 11: {
                        if (signal[1][i + 2] && signal[3][i]) num = 2;
                        else if (signal[1][i + 2] && signal[3][i + 2]) num = 3;
                        else num = 5;
                        break;
                    }
                    case 12: {
                        if (!signal[2][i + 1]) num = 0;
                        else if (!signal[1][i + 2]) num = 6;
                        else num = 9;
                        break;
                    }
                    case 13: {
                        num = 8;
                        break;
                    }
                    default: {
                        break;
                    }
                }
                sb.append(num);
                i += 3;
                continue;
            }
            i++;
        }
        System.out.println(sb);
    }

    private static int cntOne(boolean[][] signal, int i) {
        int cnt = 0;
        for (int col = i; col <= i + 2; col++) {
            for (int row = 0; row < 5; row++) {
                if (signal[row][col]) {
                    cnt++;
                }
            }
        }
        return cnt;
    }

    private static boolean colIsOne(boolean[][] signal, int i, int colSize) {
        for (int row = 0; row < 5; row++) {
            if (!signal[row][i]) return false;
        }
        if (i + 1 >= colSize) {
            return true;
        }
        return !signal[0][i + 1];
    }


    private static boolean colIsEmpty(boolean[][] signal, int i) {
        for (int row = 0; row < 5; row++) {
            if (signal[row][i]) {
                return false;
            }
        }
        return true;
    }
}
