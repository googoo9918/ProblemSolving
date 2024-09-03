import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
  public void solution() throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int[][] points = new int[n][2];
    for(int i=0; i<n; i++){
      StringTokenizer st = new StringTokenizer(br.readLine());
      points[i][0] = Integer.parseInt(st.nextToken());
      points[i][1] = Integer.parseInt(st.nextToken());
    }

    Arrays.sort(points, new Comparator<int[]>() {
      @Override
      public int compare(int[] i1, int[] i2){
        if(i1[1]==i2[1]) return i1[0]-i2[0];
        else{
          return i1[1]-i2[1];
        }
      }
    });

    for(int[] i : points){
      System.out.println(i[0] + " " + i[1]);
    }
  }
  public static void main(String[] args) throws Exception{
    new Main().solution();
  }

}
