import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
  public void solution() throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int[] scores = new int[n];
    for(int i=0; i<n; i++){
      scores[i] = Integer.parseInt(br.readLine());
    }
    Arrays.sort(scores);
    int low = (int)Math.round(n*0.15);
    int high = n - low;
    double sum = 0;
    for(int i=low; i<high; i++){
      sum += scores[i];
    }
    sum /= high-low;
    System.out.println(Math.round(sum));
  }
  public static void main(String[] args) throws Exception{
    new Main().solution();
  }
}
