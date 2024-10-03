import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
  int k;
  int[][] iarr;
  public void solution() throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    k = Integer.parseInt(br.readLine());
    iarr = new int[k][2];
    iarr[0] = new int[]{0, 1};
    for(int i=1; i<k; i++){
      iarr[i][0] = iarr[i-1][1];
      iarr[i][1] = iarr[i-1][0] + iarr[i-1][1];
    }
    System.out.println(iarr[k-1][0] + " "+ iarr[k-1][1]);
  }
  public static void main(String[] args) throws Exception{
    new Main().solution();
  }
}
