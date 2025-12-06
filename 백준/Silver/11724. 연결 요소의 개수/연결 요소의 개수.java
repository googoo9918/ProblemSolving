import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
  static int n, m, cnt = 0;
  static List<Integer>[] list;
  static boolean[] isVisited;
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    n = Integer.parseInt(st.nextToken());
    m = Integer.parseInt(st.nextToken());

    list = new ArrayList[n+1];
    for(int i=1; i<=n; i++){
      list[i] = new ArrayList<>();
    }
    isVisited = new boolean[n+1];
    for(int i=0; i<m; i++){
      st = new StringTokenizer(br.readLine());
      int start = Integer.parseInt(st.nextToken());
      int end = Integer.parseInt(st.nextToken());

      list[start].add(end);
      list[end].add(start);
    }

    for(int i=1; i<=n; i++){
      if(!isVisited[i]){
        dfs(i);
        cnt++;
      }
    }

    System.out.println(cnt);
  }

  private static void dfs(int start){
    isVisited[start] = true;

    for (int next : list[start]) {
      if(!isVisited[next]){
        dfs(next);
      }
    }
  }
}
