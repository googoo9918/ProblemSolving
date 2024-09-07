import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  static int N;
  static int S;
  static int cnt;
  static int[] iarr;
  public void solution() throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    N = Integer.parseInt(st.nextToken());
    S = Integer.parseInt(st.nextToken());
    iarr = new int[N];
    st = new StringTokenizer(br.readLine());
    for(int i=0; i<N; i++){
      iarr[i] = Integer.parseInt(st.nextToken());
    }
    dfs(0,0);
    System.out.println(S==0 ? cnt-1 : cnt);
  }

  private void dfs(int idx, int sum) {
    if(idx == N){
      if(sum == S) {
        cnt++;
      }
      return;
    }

    dfs(idx+1, sum);

    dfs(idx+1, sum+iarr[idx]);
  }

  public static void main(String[] args) throws Exception{
    new Main().solution();
  }
}
