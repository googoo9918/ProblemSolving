import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public void solution() throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int[] iarr = new int[n];
    StringTokenizer st = new StringTokenizer(br.readLine());
    int max = -1;
    for (int i=0; i<n; i++){
      iarr[i] = Integer.parseInt(st.nextToken());
      max = Math.max(max, iarr[i]);
    }

    double[] darr = new double[n];
    double sum = 0;
    for(int i=0; i<n; i++){
      darr[i] = (double)iarr[i]/max*100;
      sum += darr[i];
    }

    System.out.println(sum/n);
  }
  public static void main(String[] args) throws Exception{
    new Main().solution();
  }
}
