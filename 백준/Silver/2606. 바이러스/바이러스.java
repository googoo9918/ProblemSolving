import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
  int computer, pairs;
  ArrayList<Integer>[] graph;
  boolean[] isVisited;
  public void solution() throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    computer = Integer.parseInt(br.readLine());
    pairs = Integer.parseInt(br.readLine());
    isVisited = new boolean[computer+1];
    graph = new ArrayList[computer+1];
    
    for(int i=1; i<=computer; i++){
      graph[i] = new ArrayList<>();
    }

    for(int i=1; i<=pairs; i++){
      StringTokenizer st = new StringTokenizer(br.readLine());
      int a = Integer.parseInt(st.nextToken());
      int b = Integer.parseInt(st.nextToken());
      graph[a].add(b);
      graph[b].add(a);
    }

    System.out.println(bfs(1));
  }

  private int bfs(int i) {
    Queue<Integer> queue = new LinkedList<>();
    int cnt = 0;
    queue.add(i);
    isVisited[i] = true;
    while (!queue.isEmpty()) {
      int node = queue.poll();
      for(int next : graph[node]){
        if(!isVisited[next]){
          isVisited[next] = true;
          queue.add(next);
          cnt++;
        }
      }
    }
    return cnt;
  }

  public static void main(String[] args) throws Exception{
    new Main().solution();
  }
}
