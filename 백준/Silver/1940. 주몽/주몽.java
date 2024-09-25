import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
  static int n,m;
  static int[] iarr;
  public void solution() throws Exception{
    input();
    Arrays.sort(iarr);
    System.out.println(twoPointer());
  }

  private int twoPointer() {
    int x1 = 0, x2 = n-1;
    int cnt = 0;
    while(x1 < x2){
      int sum = iarr[x1] + iarr[x2];
      if(sum==m){
        cnt++;
        x1++; x2--;
      }
      else if(sum>m) x2--;
      else x1++;
    }
    return cnt;
  }

  private void input() throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    n = Integer.parseInt(br.readLine());
    m = Integer.parseInt(br.readLine());
    iarr = new int[n];
    StringTokenizer st = new StringTokenizer(br.readLine());
    for(int i=0; i<n; i++){
      iarr[i] = Integer.parseInt(st.nextToken());
    }
  }

  public static void main(String[] args) throws Exception{
    new Main().solution();
  }
}
