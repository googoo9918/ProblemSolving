import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  static int N, M;
  static int[][] rectangle;
  public void solution() throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    N = Integer.parseInt(st.nextToken());
    M = Integer.parseInt(st.nextToken());
    rectangle = new int[N][M];

    for(int i=0; i<N; i++){
      String s = br.readLine();
      for(int j=0; j<M; j++){
        rectangle[i][j] = Integer.parseInt(String.valueOf(s.charAt(j)));
      }
    }
    int min = Math.min(N,M)-1;
    System.out.println(calculateSize(min));
  }

  private int calculateSize(int min) {
    for(int i=min; i>=1; i--){
      for(int j=0; j<N-i; j++){
        for(int k=0; k<M-i; k++){
          if(isSquare(i, j, k)) {
            return (i+1)*(i+1);
          }
        }
      }
    }
    return 1;
  }

  private boolean isSquare(int i, int j, int k) {
    if(rectangle[j][k] != rectangle[j+i][k]) return false;
    if(rectangle[j][k] != rectangle[j][k+i]) return false;
    if(rectangle[j][k] != rectangle[j+i][k+i]) return false;
    return true;
  }

  public static void main(String[] args) throws Exception{
    new Main().solution();
  }

}
