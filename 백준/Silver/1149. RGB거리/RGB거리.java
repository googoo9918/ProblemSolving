import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public void solution() throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int[][] iarr = new int[n][3];
    int[][] dp = new int[n][3];

    for(int i=0; i<n; i++){
      StringTokenizer st = new StringTokenizer(br.readLine());
      iarr[i][0] = Integer.parseInt(st.nextToken());
      iarr[i][1] = Integer.parseInt(st.nextToken());
      iarr[i][2] = Integer.parseInt(st.nextToken());
    }

    dp[0][0] = iarr[0][0];
    dp[0][1] = iarr[0][1];
    dp[0][2] = iarr[0][2];

    for(int i=1; i<n; i++){
      dp[i][0] = iarr[i][0] + Math.min(dp[i-1][1], dp[i-1][2]);
      dp[i][1] = iarr[i][1] + Math.min(dp[i-1][0], dp[i-1][2]);
      dp[i][2] = iarr[i][2] + Math.min(dp[i-1][0], dp[i-1][1]);
    }

    System.out.println(Math.min(dp[n-1][0],Math.min(dp[n-1][1],dp[n-1][2])));
  }
  public static void main(String[] args) throws Exception{
    new Main().solution();
  }

}
