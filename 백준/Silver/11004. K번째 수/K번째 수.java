import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
  public void solution() throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int k = Integer.parseInt(st.nextToken());
    int[] narr = new int[n];
    st = new StringTokenizer(br.readLine());
    for(int i=0; i<n; i++){
      narr[i] = Integer.parseInt(st.nextToken());
    }

    Arrays.sort(narr);
    System.out.println(narr[k-1]);
  }
  public static void main(String[] args) throws Exception{
    new Main().solution();
  }
}
