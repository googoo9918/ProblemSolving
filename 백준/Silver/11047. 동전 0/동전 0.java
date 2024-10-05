import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
  public void solution() throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int k = Integer.parseInt(st.nextToken());
    int[] coins = new int[n];
    for(int i=0; i<n; i++){
      coins[i] = Integer.parseInt(br.readLine());
    }
    int tmp = k, total=0;
    for(int i=coins.length-1; i>=0; i--){
      if(coins[i]>k) continue;
      else{
        int cnt = 0;
        cnt += tmp/coins[i];
        tmp -= coins[i] * cnt;
        total += cnt;
        if(tmp == 0) break;
      }
    }
    System.out.println(total);
  }
  public static void main(String[] args) throws Exception{
    new Main().solution();
  }
}
