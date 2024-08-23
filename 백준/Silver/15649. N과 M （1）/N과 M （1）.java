import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  static int N;
  static int M;
  static StringBuilder sb = new StringBuilder();
  static int[] arr;
  static boolean[] visited;
  public void solution() throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    N = Integer.parseInt(st.nextToken());
    M = Integer.parseInt(st.nextToken());
    arr = new int[M];
    visited = new boolean[N+1];
    dfs(0);
    System.out.println(sb);
  }
  public static void dfs(int depth){
    if(depth == M){
      for(int i : arr){
        sb.append(i).append(' ');
      }
      sb.append("\n");
      return;
    }

    for(int i=1; i<=N; i++){
      if(!visited[i]){
        visited[i] = true;
        arr[depth] = i;
        dfs(depth+1);
        visited[i] = false;
      }
    }
  }
  public static void main(String[] args) throws Exception{
    new Main().solution();
  }
}
