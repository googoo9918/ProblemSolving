import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
  int[][] graph;
  int W, H;
  int[] dx = new int[]{1,1,0,-1,-1,-1,0,1};
  int[] dy = new int[]{0,-1,-1,-1,0,1,1,1};
  public void solution() throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    while(true){
      StringTokenizer st = new StringTokenizer(br.readLine());
      W = Integer.parseInt(st.nextToken());
      H = Integer.parseInt(st.nextToken());
      if(W==0) break;

      graph = new int[H][W];
      for(int i=0; i<H; i++){
        st = new StringTokenizer(br.readLine());
        for(int j=0; j<W; j++){
          if(Integer.parseInt(st.nextToken())==1){
            graph[i][j] = 1;
          }
        }
      }

      int cnt = 0;
      for(int i=0; i<H; i++){
        for(int j=0; j<W; j++){
          if(graph[i][j]==1){
            bfs(i,j);
            cnt++;
          }
        }
      }
      System.out.println(cnt);
    }
  }

  private void bfs(int y, int x) {
    Queue<int[]> queue = new LinkedList<>();
    queue.add(new int[]{y, x});
    graph[y][x] = 0;
    while (!queue.isEmpty()) {
      int[] node = queue.poll();
      for(int k=0; k<8; k++){
        int nx = node[1] + dx[k];
        int ny = node[0] + dy[k];
        if(nx>=0 && nx<W && ny>=0 && ny<H && graph[ny][nx] == 1){
          queue.add(new int[]{ny, nx});
          graph[ny][nx] = 0;
        }
      }
    }
  }

  public static void main(String[] args) throws Exception{
    new Main().solution();
  }
}
