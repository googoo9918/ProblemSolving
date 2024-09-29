import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
  int N,M,V;
  ArrayList<Integer>[] graph;
  boolean[] isVisited;
  StringBuilder sb = new StringBuilder();
  public void solution() throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    N = Integer.parseInt(st.nextToken());
    M = Integer.parseInt(st.nextToken());
    V = Integer.parseInt(st.nextToken());

    graph = new ArrayList[N+1];
    isVisited = new boolean[N+1];

    for(int i=1; i<=N; i++){
      graph[i] = new ArrayList<>();
    }

    for(int i=1; i<=M; i++){
      st = new StringTokenizer(br.readLine());
      int start = Integer.parseInt(st.nextToken());
      int end = Integer.parseInt(st.nextToken());
      graph[start].add(end);
      graph[end].add(start);
    }

    for(int i=1; i<=N; i++){
      Collections.sort(graph[i]);
    }

    dfs(V);
    System.out.println(sb);
    sb.setLength(0);
    Arrays.fill(isVisited, false);
    
    bfs(V);
    System.out.println(sb);
  }

  private void bfs(int v) {
    Queue<Integer> queue = new LinkedList<>();
    isVisited[v]= true;
    queue.add(v);
    while (!queue.isEmpty()) {
      int node = queue.poll();
      sb.append(node).append(" ");

      for(int next : graph[node]){
        if(!isVisited[next]){
          isVisited[next] = true;
          queue.add(next);
        }
      }
    }
  }

  private void dfs(int v) {
    isVisited[v] = true;
    sb.append(v).append(" ");
    for(int next : graph[v]){
      if(!isVisited[next]){
        dfs(next);
      }
    }
  }

  public static void main(String[] args) throws Exception{
    new Main().solution();
  }
}
