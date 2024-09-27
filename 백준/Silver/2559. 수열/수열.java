import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  int n,k = 0;
  int[] iarr;
  public void solution() throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    n = Integer.parseInt(st.nextToken());
    k = Integer.parseInt(st.nextToken());
    iarr = new int[n];
    st = new StringTokenizer(br.readLine());
    for(int i=0; i<n; i++){
      iarr[i] = Integer.parseInt(st.nextToken());
    }

    int max = 0, left = 0, right = k, sum = 0;
    for(int i=0; i<k; i++){
      sum += iarr[i];
    }
    max = sum;

    while(right != n){
      sum += iarr[right++];
      sum -= iarr[left++];

      max = Math.max(sum,max);
    }

    System.out.println(max);
  }
  public static void main(String[] args) throws Exception{
    new Main().solution();
  }
}
