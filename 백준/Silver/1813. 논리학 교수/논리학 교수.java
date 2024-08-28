import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public void solution() throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int[] narr = new int[51];
    StringTokenizer st = new StringTokenizer(br.readLine());
    for(int i=0; i<n; i++){
      narr[Integer.parseInt(st.nextToken())]++;
    }
    int result = -1;
    for(int i=0; i<=n; i++){
      if(narr[i] == i) result = i;
    }

    System.out.println(result);
  }
  public static void main(String[] args) throws Exception{
    new Main().solution();
  }
}
