import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
  public void solution() throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    Set<Integer> set = new HashSet<>();
    int n = Integer.parseInt(br.readLine());
    StringBuilder sb = new StringBuilder();
    for(int i=0; i<n; i++){
      StringTokenizer st = new StringTokenizer(br.readLine());
      String s = st.nextToken();
      int tmp;
      switch (s) {
        case "add":
          tmp = Integer.parseInt(st.nextToken());
          set.add(tmp);
          break;
        case "remove":
          tmp = Integer.parseInt(st.nextToken());
          set.remove(tmp);
          break;
        case "check":
          tmp = Integer.parseInt(st.nextToken());
          if(set.contains(tmp)) sb.append("1").append("\n");
          else sb.append("0").append("\n");
          break;
        case "toggle":
          tmp = Integer.parseInt(st.nextToken());
          if(set.contains(tmp)) set.remove(tmp);
          else set.add(tmp);
          break;
        case "all":
          set = new HashSet<>();
          for(int j=1; j<=20; j++){
            set.add(j);
          }
          break;
        case "empty":
          set.clear();
          break;
      }
    }
    System.out.println(sb);
  }
  public static void main(String[] args) throws Exception{
    new Main().solution();
  }
}
