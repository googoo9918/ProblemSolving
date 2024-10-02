import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
  int T, I;
  int[][] board;
  boolean[][] visited;
  int[] start = new int[2];
  int[] end = new int[2];
  int[] dx = new int[]{1, 2, 2, 1, -1, -2, -2, -1};
  int[] dy = new int[]{2, 1, -1, -2, -2, -1, 1, 2};
  public void solution() throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    T = Integer.parseInt(br.readLine());
    for(int i=0 ; i<T; i++){
      I = Integer.parseInt(br.readLine());
      board = new int[I][I];
      visited = new boolean[I][I];
      StringTokenizer st = new StringTokenizer(br.readLine());

      start[0] = Integer.parseInt(st.nextToken());
      start[1] = Integer.parseInt(st.nextToken());
      st = new StringTokenizer(br.readLine());
      end[0] = Integer.parseInt(st.nextToken());
      end[1] = Integer.parseInt(st.nextToken());

      System.out.println(bfs(start, end));
    }
  }

  private int bfs(int[] start, int[] end) {
    Queue<int[]> queue = new LinkedList<>();
    queue.add(new int[]{start[0], start[1], 0});
    visited[start[0]][start[1]] = true;
    while(!queue.isEmpty()){
      int[] node = queue.poll();

      if(node[0] == end[0] && node[1] == end[1]) return node[2];
      for(int i=0; i<8; i++){
        int nx = node[0] + dx[i];
        int ny = node[1] + dy[i];
        if(nx>=0 && nx<I && ny>=0 && ny<I && !visited[nx][ny]){
          queue.add(new int[]{nx,ny,node[2]+1});
          visited[nx][ny] = true;
        }
      }
    }
    return -1;
  }

  public static void main(String[] args) throws Exception{
    new Main().solution();
  }
}
