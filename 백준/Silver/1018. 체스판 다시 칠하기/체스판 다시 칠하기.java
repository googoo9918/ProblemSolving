import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public void solution() throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());
    char[][] board = new char[n][m];
    for(int i=0; i<n; i++){
      String s = br.readLine();
      for(int j=0; j<m; j++){
        board[i][j] = s.charAt(j);
      }
    }

    int min = Integer.MAX_VALUE;
    for(int i=0; i<=n-8; i++){
      for(int j=0; j<=m-8; j++){
        min = Math.min(min, countMin(board,i,j));
      }
    }
    System.out.println(min);
  }

  public int countMin(char[][] board, int row, int col){
    int count1 = 0; // w 시작
    int count2 = 0;
    for(int i=0; i<8; i++){
      for(int j=0; j<8; j++){
        if((i+j)%2 == 0){
          if(board[row+i][col+j] != 'W') count1++;
          else count2++;
        }
        else{
          if(board[row+i][col+j] != 'B') count1++;
          else count2++;
        }
      }
    }
    return Math.min(count1, count2);
  }
  public static void main(String[] args) throws Exception{
    new Main().solution();
  }
}
