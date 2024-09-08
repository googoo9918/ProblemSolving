import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public void solution() throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int cnt = 1;
    while(true){
      StringTokenizer st = new StringTokenizer(br.readLine());
      int l = Integer.parseInt(st.nextToken());
      int p = Integer.parseInt(st.nextToken());
      int v = Integer.parseInt(st.nextToken());
      if(l==0) break;
      int ans = v/p*l + Math.min(v%p, l);
      System.out.println("Case " + cnt + ": " + ans);
      cnt++;
    }
  }
  public static void main(String[] args) throws Exception{
    new Main().solution();
  }

}
