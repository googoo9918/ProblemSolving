import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  int N, M;
  int[][] iarr, sum;
  public void solution() throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    N = Integer.parseInt(st.nextToken());
    M = Integer.parseInt(st.nextToken());
    iarr= new int[N+1][N+1];
    sum = new int[N+1][N+1];
    for(int i=1; i<=N; i++){
      st = new StringTokenizer(br.readLine());
      for(int j=1; j<=N; j++){
        iarr[i][j] = Integer.parseInt(st.nextToken());
        sum[i][j] = iarr[i][j] + sum[i-1][j] + sum[i][j-1] - sum[i-1][j-1];
      }
    }

    StringBuilder sb = new StringBuilder();
    for(int i=0; i<M; i++){
      st = new StringTokenizer(br.readLine());
      int startX = Integer.parseInt(st.nextToken());
      int startY = Integer.parseInt(st.nextToken());
      int endX = Integer.parseInt(st.nextToken());
      int endY = Integer.parseInt(st.nextToken());
      sb.append(
          sum[endX][endY] - sum[startX - 1][endY] - sum[endX][startY - 1] + sum[startX - 1][startY - 1]).append("\n");
    }
    System.out.println(sb);
  }
  public static void main(String[] args) throws Exception{
    new Main().solution();
  }
}
