import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public void solution() throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());
    st = new StringTokenizer(br.readLine());
    int[] narr = new int[n];
    long[] sum = new long[n];
    for(int i=0; i<n; i++){
      narr[i] = Integer.parseInt(st.nextToken());
      if(i==0) sum[i] = narr[i];
      else sum[i] = sum[i-1] + narr[i];
    }

    for(int i=0; i<m; i++){
      st = new StringTokenizer(br.readLine());
      int start = Integer.parseInt(st.nextToken());
      int end = Integer.parseInt(st.nextToken());
      if(start == 1) System.out.println(sum[end-1]);
      else{
        System.out.println(sum[end-1]-sum[start-2]);
      }
    }
  }
  public static void main(String[] args) throws Exception{
    new Main().solution();
  }
}
