import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public void solution() throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine());
    for(int i=0; i<t; i++){
      StringTokenizer st = new StringTokenizer(br.readLine());
      int n = Integer.parseInt(st.nextToken());
      int[] narr = new int[n];
      for(int j=0; j<n; j++){
        narr[j] = Integer.parseInt(st.nextToken());
      }
      long sum = 0;
      for(int j=0; j<n-1; j++){
        for(int k=j+1; k<n; k++){
          sum += gcd(narr[j],narr[k]);
        }
      }
      System.out.println(sum);
    }
  }
  public int gcd(int j, int k){
    while(k!=0){
      int tmp = k;
      k = j%k;
      j = tmp;
    }
    return j;
  }
  public static void main(String[] args) throws Exception{
    new Main().solution();
  }
}
