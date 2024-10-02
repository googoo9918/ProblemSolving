import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
  int T, M, N, K;
  int[][] graph;

  int[] dx = new int[]{0, 1, 0, -1};
  int[] dy = new int[]{1, 0, -1, 0};
  public void solution() throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    T = Integer.parseInt(br.readLine());
    for(int i=0; i<T; i++){
      StringTokenizer st = new StringTokenizer(br.readLine());
      M = Integer.parseInt(st.nextToken());
      N = Integer.parseInt(st.nextToken());
      K = Integer.parseInt(st.nextToken());
      graph = new int[N][M];

      for(int j=0; j<K; j++) {
        st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        graph[y][x] = 1;
      }

      int count = 0;
      for(int j=0; j<N; j++){
        for(int k=0; k<M; k++){
          if(graph[j][k]==1){
            count++;
            bfs(j,k);
          }
        }
      }
      System.out.println(count);
    }
  }

  private int bfs(int y, int x) {
    Queue<int[]> queue = new LinkedList<>();
    queue.add(new int[]{y,x});
    graph[y][x] = 0;
    while (!queue.isEmpty()) {
      int[] node = queue.poll();
      for(int i=0; i<4; i++){
        int nx = node[1] + dx[i];
        int ny = node[0] + dy[i];
        if(nx>=0 && nx<M && ny>=0 && ny<N && graph[ny][nx]==1){
          queue.add(new int[]{ny,nx});
          graph[ny][nx] = 0;
        }
      }
    }
    return 0;
  }

  public static void main(String[] args) throws Exception{
    new Main().solution();
  }
}
