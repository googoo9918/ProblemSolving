import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
  public void solution() throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int[] narr = new int[n];
    int idx = 0;
    for(int i=0; i<Integer.MAX_VALUE; i++){
      String s = String.valueOf(i);
      if(s.contains("666")) {
        narr[idx] = i;
        if(idx == n-1) break;
        idx++;
      }
    }
    System.out.println(narr[n-1]);
  }
  public static void main(String[] args) throws Exception{
    new Main().solution();
  }
}
