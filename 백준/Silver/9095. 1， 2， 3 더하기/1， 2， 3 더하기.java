import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
  int T;
  int N;
  int[] dp = new int[11];
  public void solution() throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    T = Integer.parseInt(br.readLine());
    StringBuilder sb = new StringBuilder();
    //1
    dp[1] = 1;
    //2, 1+1
    dp[2] = 2;
    //3, 2+1, 1+2, 1+1+1
    dp[3] = 4;
    //4, 1+1+1+1, 2+1+1, 1+2+1, 1+1+2, 2+2, 3+1, 1+3 -> 7
    //5, 1+1+1+1+1, 2+1+1+1(4), 3+1+1(3), 2+2+1(3), 3+2(2) -> 13
    for(int i=4; i<=10; i++) {
      dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
    }
    for(int t=0; t<T; t++){
      N = Integer.parseInt(br.readLine());
      sb.append(dp[N]).append("\n");
    }
    System.out.println(sb);
  }
  public static void main(String[] args) throws Exception{
    new Main().solution();
  }
}
