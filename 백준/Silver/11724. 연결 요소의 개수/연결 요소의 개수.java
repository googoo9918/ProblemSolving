import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
  int N,M;
  ArrayList<Integer>[] graph;
  boolean[] visited;
  public void solution() throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    N = Integer.parseInt(st.nextToken());
    M = Integer.parseInt(st.nextToken());
    graph = new ArrayList[N+1];
    visited = new boolean[N+1];

    for(int i=1; i<=N; i++){
      graph[i] = new ArrayList<>();
    }

    for(int i=1; i<=M; i++){
      st = new StringTokenizer(br.readLine());
      int x = Integer.parseInt(st.nextToken());
      int y = Integer.parseInt(st.nextToken());
      graph[x].add(y);
      graph[y].add(x);
    }

    int cnt = 0;
    for(int i=1; i<=N; i++){
      if(!visited[i]){
        bfs(i);
        cnt++;
      }
    }

    System.out.println(cnt);
  }

  private void bfs(int i) {
    Queue<Integer> queue = new LinkedList<>();
    queue.add(i);
    visited[i] = true;
    while (!queue.isEmpty()) {
      int node = queue.poll();
      for(int next : graph[node]){
        if(!visited[next]){
          queue.add(next);
          visited[next] = true;
        }
      }
    }
  }

  public static void main(String[] args) throws Exception{
    new Main().solution();
  }
}
