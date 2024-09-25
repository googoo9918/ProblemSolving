import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
  static int n,m;
  static int[] iarr;
  public void solution() throws Exception{
    input();
    System.out.println(countM());
  }

  private int countM() {
    int left = 0, right = 0, cnt = 0, sum = 0;
    // 끝까지 다 더 했는데 sum이 m보다 작을 때 종료하면 됨.
    while (true) {
      if(sum<m){
        sum += iarr[right++];
      }
      else if(sum>=m){
        sum -= iarr[left++];
      }

      if(right==n && sum<m) break;
      if(sum == m) cnt++;
    }
    return cnt;
  }

  private void input() throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    n = Integer.parseInt(st.nextToken());
    m = Integer.parseInt(st.nextToken());
    iarr = new int[n];
    st = new StringTokenizer(br.readLine());
    for(int i=0; i<n; i++){
      iarr[i] = Integer.parseInt(st.nextToken());
    }
  }

  public static void main(String[] args) throws Exception{
    new Main().solution();
  }
}
