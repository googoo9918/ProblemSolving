import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
  public void solution() throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int count = 0;
    for(int i=1; i<=n; i++){
        int sum = 0;
        for(int j=i; j<=n; j++){
          sum += j;
          if(sum==n) count++;
          else if(sum>n) break;
        }
    }
    System.out.println(count);
  }
  public static void main(String[] args) throws Exception{
    new Main().solution();
  }
}
