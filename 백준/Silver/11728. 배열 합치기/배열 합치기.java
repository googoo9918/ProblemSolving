import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
  public void solution() throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int a = Integer.parseInt(st.nextToken());
    int b = Integer.parseInt(st.nextToken());
    int[] iarr = new int[a+b];
    st = new StringTokenizer(br.readLine());
    for(int i=0; i<a; i++){
      iarr[i] = Integer.parseInt(st.nextToken());
    }
    st = new StringTokenizer(br.readLine());
    for(int i=a; i<a+b; i++){
      iarr[i] = Integer.parseInt(st.nextToken());
    }
    Arrays.sort(iarr);
    StringBuilder sb = new StringBuilder();
    for(int i : iarr){
      sb.append(i).append(" ");
    }
    System.out.println(sb);
  }
  public static void main(String[] args) throws Exception{
    new Main().solution();
  }
}
