import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
  public void solution() throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int count = 0;
    for(int i=0; i<=n/5; i++){
      int tmp = (n-5*i);
      if(tmp%3==0) count = i + tmp/3;
    }
    if(count == 0) System.out.println(-1);
    else
      System.out.println(count);
  }
  public static void main(String[] args) throws Exception{
    new Main().solution();
  }

}
