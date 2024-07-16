import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
  public void solution() throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //0층부터 시작하고, 1호부터 시작한다.
    //[0][1]부터 시작 ~ [0][14]까지..
    //기본으로 0층에 대한 정보가주어지는 것이고 물어보는것은 14층 14호까지 물어보게 됨
    int[][] iarr = new int[15][15];
    for(int i=1;i<=14; i++){
      iarr[0][i] = i;
      iarr[i][1] = 1;
    }
    for(int i=1;i<=14; i++){
      for(int j=2; j<=14; j++){
        iarr[i][j] = iarr[i-1][j] + iarr[i][j-1];
      }
    }

    int t = Integer.parseInt(br.readLine());
    for(int i=0; i<t; i++){
      int k = Integer.parseInt(br.readLine());
      int n = Integer.parseInt(br.readLine());
      System.out.println(iarr[k][n]);
    }
  }
  public static void main(String[] args) throws Exception{
    new Main().solution();
  }
}
