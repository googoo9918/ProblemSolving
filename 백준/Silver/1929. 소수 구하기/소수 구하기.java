import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
  public void solution() throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    StringBuilder sb = new StringBuilder();
    int m = Integer.parseInt(st.nextToken());
    if(m==1) m++;
    int n = Integer.parseInt(st.nextToken());
    for(int i = m; i<=n; i++){
      if(isPrime(i)) sb.append(i).append("\n");
    }
    System.out.println(sb);
  }
  public boolean isPrime(int i){
    for(int j=2; j<=Math.sqrt(i); j++){
      if(i%j ==0) return false;
    }
    return true;
  }
  public static void main(String[] args) throws Exception{
    new Main().solution();
  }
}