import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
  private static final int MOD = 1234567891;

  public void solution() throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    String s = br.readLine();
    long sum = 0;
    for(int i=0; i<n; i++){
      long tmp = s.charAt(i)-'a'+1;
      for(int j=0; j<i; j++){
        tmp = (tmp * 31) % MOD;
      }
      sum = (sum + tmp) % MOD;
    }
    System.out.println(sum);
  }
  public static void main(String[] args) throws Exception{
    new Main().solution();
  }
}