import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
  int N;
  int[] stairs, dp;
  // 한 번에 한 계단 or 두 계단
  // 연속 3개 불가능
  // 마지막 도착 계단은 반드시 밟아야 함
  // 처음은 0 or 1을 밟아야 하고, 마지막도 무조건 밟아야 하니 마지막도 N-2나 N-3 둘중 하나 밟아야 함
  // dp를 만들고.... 각 계단을 밟을 때 최댓값을 구하긴 해야할 듯?
  // 결국 dp는 점화식을 만드는게 핵심이다.
  // dp[i-2] + stairs[i] vs
  public void solution() throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    N = Integer.parseInt(br.readLine());
    stairs = new int[N+1];
    dp = new int[N+1];
    for(int i=1; i<=N; i++){
      stairs[i] = Integer.parseInt(br.readLine());
    }
    if (N == 1) {
        System.out.println(stairs[1]);
        return;
    } else if (N == 2) {
        System.out.println(stairs[1] + stairs[2]);
        return;
    }  
    // 첫 계단 최댓값
    dp[1] = stairs[1];
    dp[2] = stairs[1]+stairs[2];
    dp[3] = Math.max(stairs[2]+stairs[3], stairs[1]+stairs[3]);
    //결국 124 냐 134냐의 차이인데.....
    // 4-->
    for(int i=4; i<=N; i++){
      dp[i] = Math.max(dp[i-2]+stairs[i], dp[i-3] + stairs[i-1] + stairs[i]);
    }
    System.out.println(dp[N]);
  }
  public static void main(String[] args) throws Exception{
    new Main().solution();
  }
}
