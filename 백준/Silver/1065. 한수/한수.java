import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
  public void solution() throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int cnt = 0;
    if(n<100) System.out.println(n);
    else{
      for(int i=100; i<=n; i++){
        int tmp = i%10 - i/10%10;
        int tmp2 = i/10%10 - i/100%10;
        if(tmp == tmp2 && i<1000) cnt++;
      }
      System.out.println(cnt+99);
    }
  }
  public static void main(String[] args) throws Exception{
    new Main().solution();
  }

}
