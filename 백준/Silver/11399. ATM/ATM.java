import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
  public void solution() throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine());
    int[] narr = new int[n];
    for(int i=0; i<n; i++){
      narr[i] = Integer.parseInt(st.nextToken());
    }

    Arrays.sort(narr);

    int sum=0, totalSum=0;
    for(int i: narr){
      sum += i;
      totalSum += sum;
    }
    System.out.println(totalSum);
  }
  public static void main(String[] args) throws Exception{
    new Main().solution();
  }
}
