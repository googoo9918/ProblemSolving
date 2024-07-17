import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;

public class Main {
  public void solution() throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int k = Integer.parseInt(st.nextToken());
    int seqN = 1, seqK = 1;
    for(int i=n; i>n-k; i--){
      seqN *= i;
    }
    for(int i=1; i<=k; i++){
      seqK *= i;
    }
    System.out.println(seqN / seqK);
  }
  public static void main(String[] args) throws Exception{
    new Main().solution();
  }
}
