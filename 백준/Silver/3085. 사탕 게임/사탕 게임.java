import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
  public void solution() throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    char[][] board = new char[n][n];

    for (int i = 0; i < n; i++) {
      String s = br.readLine();
      for (int j = 0; j < n; j++) {
        board[i][j] = s.charAt(j);
      }
    }

    int max = Integer.MIN_VALUE;

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        if (j + 1 < n) {
          swap(board, i, j, i, j + 1);
          max = Math.max(max, countCandy(board));
          swap(board, i, j, i, j + 1);
        }

        if (i + 1 < n) {
          swap(board, i, j, i + 1, j);
          max = Math.max(max, countCandy(board));
          swap(board, i, j, i + 1, j);
        }
      }
    }

    System.out.println(max);
  }

  private int countCandy(char[][] board) {
    int n = board.length;
    int max = 1;

    for (int i = 0; i < n; i++) {
      int count = 1;
      for (int j = 1; j < n; j++) {
        if (board[i][j] == board[i][j - 1]) {
          count++;
        } else {
          count = 1;
        }
        max = Math.max(max, count);
      }
    }

    for (int i = 0; i < n; i++) {
      int count = 1;
      for (int j = 1; j < n; j++) {
        if (board[j][i] == board[j - 1][i]) {
          count++;
        } else {
          count = 1;
        }
        max = Math.max(max, count);
      }
    }

    return max;
  }

  private void swap(char[][] board, int x1, int y1, int x2, int y2) {
    char temp = board[x1][y1];
    board[x1][y1] = board[x2][y2];
    board[x2][y2] = temp;
  }

  public static void main(String[] args) throws Exception {
    new Main().solution();
  }
}
