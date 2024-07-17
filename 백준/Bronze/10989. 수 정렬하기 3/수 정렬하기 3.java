import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
  public void solution() throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int[] iarr = new int[n];
    for(int i=0; i<n; i++){
      iarr[i] = Integer.parseInt(br.readLine());
    }
    Arrays.sort(iarr);
    StringBuilder sb = new StringBuilder();
    for(int i : iarr){
      sb.append(i).append("\n");
    }
    System.out.println(sb);
  }
  public static void main(String[] args) throws Exception{
    new Main().solution();
  }
}
