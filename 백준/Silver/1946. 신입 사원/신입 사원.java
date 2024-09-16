import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
  static int T, N;
  static Integer[][] narr;
  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  public void solution() throws Exception{
    T = Integer.parseInt(br.readLine());
    for(int i=0; i<T; i++){
      input();
      Arrays.sort(narr, new Comparator<Integer[]>() {
        @Override
        public int compare(Integer[] o1, Integer[] o2) {
          return o1[0]- o2[0];
        }
      });
      System.out.println(countNew());
    }
  }

  private void input() throws Exception{
    N = Integer.parseInt(br.readLine());
    narr = new Integer[N][2];
    for(int i=0; i<N; i++){
      StringTokenizer st = new StringTokenizer(br.readLine());
      for(int j=0; j<2; j++){
        narr[i][j] = Integer.parseInt(st.nextToken());
      }
    }
  }

  private int countNew() {
    int min = narr[0][1];
    int cnt = 1;
    for(int i=0; i<N; i++){
      if(narr[i][1] < min){
        cnt++;
        min = narr[i][1];
      }
    }
    return cnt;
  }

  public static void main(String[] args) throws Exception{
    new Main().solution();
  }

}
