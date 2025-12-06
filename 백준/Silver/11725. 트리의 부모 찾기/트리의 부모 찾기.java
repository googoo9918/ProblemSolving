import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
  static List<Integer>[] list;
  static boolean[] isVisited;
  static int[] parent;
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    list = new ArrayList[n+1];
    for(int i=1; i<=n; i++){
      list[i] = new ArrayList<>();
    }
    isVisited = new boolean[n+1];
    parent = new int[n+1];

    StringTokenizer st;
    for(int i=0; i<n-1; i++){
      st = new StringTokenizer(br.readLine());
      int start = Integer.parseInt(st.nextToken());
      int end = Integer.parseInt(st.nextToken());

      list[start].add(end);
      list[end].add(start);
    }

    dfs(1);

    StringBuilder sb = new StringBuilder();
    for(int i=2; i<=n; i++){
      sb.append(parent[i]).append("\n");
    }

    System.out.println(sb);
  }

  private static void dfs(int start){
    isVisited[start] = true;

    for(int next : list[start]){
      if (!isVisited[next]) {
        isVisited[next] = true;
        parent[next] = start;
        dfs(next);
      }
    }
  }
}
