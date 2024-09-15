import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
  public void solution() throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine());
    int[] aarr = new int[n];
    for(int i=0; i<n; i++){
      aarr[i] = Integer.parseInt(st.nextToken());
    }
    st = new StringTokenizer(br.readLine());
    Integer[] barr = new Integer[n];
    for(int i=0; i<n; i++){
      barr[i] = Integer.parseInt(st.nextToken());
    }

    Arrays.sort(aarr);
    Arrays.sort(barr, Collections.reverseOrder());
    int sum = 0;
    for(int i=0; i<n; i++){
      sum += aarr[i] * barr[i];
    }
    System.out.println(sum);
  }
  public static void main(String[] args) throws Exception{
    new Main().solution();
  }
}
