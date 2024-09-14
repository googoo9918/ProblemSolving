import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
  public void solution() throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int[] iarr = new int[3];
    StringTokenizer st = new StringTokenizer(br.readLine());
    for(int i=0; i<3; i++){
      iarr[i] = Integer.parseInt(st.nextToken());
    }

    Arrays.sort(iarr);
    StringBuilder sb = new StringBuilder();
    for(int i:iarr){
      sb.append(i).append(" ");
    }

    System.out.println(sb);
  }
  public static void main(String[] args) throws Exception{
    new Main().solution();
  }

}
