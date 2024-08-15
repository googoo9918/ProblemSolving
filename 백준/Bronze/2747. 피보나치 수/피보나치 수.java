import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
  public void solution() throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int[] iarr = new int[n+1];
    iarr[0] = 0;
    iarr[1] = 1;
    for(int i=2; i<=n; i++){
      iarr[i] = iarr[i-1] + iarr[i-2];
    }
    System.out.println(iarr[n]);
  }
  public static void main(String[] args) throws Exception{
    new Main().solution();
  }

}
