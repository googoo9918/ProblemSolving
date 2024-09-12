import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  static int N, K, L;
  public void solution() throws Exception{
    // 16 8+4+2+1
    // 1000 500+250+125+64+32+16+8+4+2+1
    // 12 / 34 / 56 / 78
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    N = Integer.parseInt(st.nextToken());
    K = Integer.parseInt(st.nextToken());
    L = Integer.parseInt(st.nextToken());
    int round = 1;
    int cnt =0;
    while(N>1){
      N/=2;
      cnt++;
    }
    for(int i=0; i<cnt; i++){
      if(K%2==1) K++;
      if(L%2==1) L++;
      if(K/2 == L/2) break;
      else{
        K/=2;
        L/=2;
        round++;
      }
    }
    System.out.println(round);
  }
  public static void main(String[] args) throws Exception{
    new Main().solution();
  }
}
