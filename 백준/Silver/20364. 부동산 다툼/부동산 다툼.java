import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  int N, Q;
  int[] ducks;
  boolean[] occupied;
  public void solution() throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    N = Integer.parseInt(st.nextToken());
    Q = Integer.parseInt(st.nextToken());
    ducks = new int[Q];
    occupied = new boolean[N+1];
    for(int i=0; i<Q; i++){
      ducks[i] = Integer.parseInt(br.readLine());
    }

    StringBuilder sb = new StringBuilder();
    for(int land : ducks){
      int current = land;
      int block = 0;
      while(current>0){
        if(occupied[current]){
          block = current;
        }
        current /= 2;
      }

      if(block == 0) {
        occupied[land] = true;
      }

      sb.append(block).append("\n");
    }
    System.out.println(sb);
  }
  public static void main(String[] args) throws Exception{
    new Main().solution();
  }
}
