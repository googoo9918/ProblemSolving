import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public void solution() throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    StringBuilder sb = new StringBuilder();
    int h = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());
    int t = Integer.parseInt(br.readLine());
    if(m+t<60){
      sb.append(h).append(" ").append(m+t);
    }else{
      int tmp = (m+t)/60;
      h = h + tmp;
      if(h>=24){
        h = h - 24;
      }
      sb.append(h).append(" ").append((m + t) % 60);
    }
    System.out.println(sb.toString());
  }
  public static void main(String[] args) throws Exception{
    new Main().solution();
  }

}
