import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
  public void solution() throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    long[][] iarr = new long[n][2];
    iarr[0] = new long[]{1, 1};
    for(int i=1; i<n; i++){
      iarr[i][0] = iarr[i-1][1];
      iarr[i][1] = iarr[i-1][0] + iarr[i-1][1];
    }

    BigInteger sum = new BigInteger(String.valueOf(iarr[n-1][0]*2 + iarr[n-1][1]*2));

    System.out.println(sum);
  }
  public static void main(String[] args) throws Exception{
    new Main().solution();
  }
}
