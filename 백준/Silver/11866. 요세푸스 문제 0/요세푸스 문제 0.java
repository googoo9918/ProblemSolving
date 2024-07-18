import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public void solution() throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    StringBuilder sb = new StringBuilder();
    int n = Integer.parseInt(st.nextToken());
    int k = Integer.parseInt(st.nextToken());
    boolean[] check = new boolean[n];
    int[] ans = new int[n];
    int cidx=0, aidx=0, cnt=0;
    while(containsFalse(check)){
      if(check[cidx]==false){
        cnt++;
        if(cnt==k){
          cnt = 0;
          ans[aidx++] = cidx;
          check[cidx] = true;
        }
      }
      if(cidx<n-1) cidx++;
      else cidx -= n-1;
    }
    sb.append("<");
    for(int i=0; i<n; i++){
      if(i!=n-1) sb.append(ans[i]+1).append(", ");
      else sb.append(ans[i]+1).append(">");
    }
    System.out.println(sb);
  }
  public static void main(String[] args) throws Exception{
    new Main().solution();
  }
  public boolean containsFalse(boolean[] check){
    for(boolean b : check){
      if(b== false) return true;
    }
    return false;
  }
}
