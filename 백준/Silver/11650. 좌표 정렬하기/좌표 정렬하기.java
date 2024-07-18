import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
  public void solution() throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int n = Integer.parseInt(br.readLine());
    List<int[]> list = new ArrayList<>();
    for(int i=0; i<n; i++){
      StringTokenizer st = new StringTokenizer(br.readLine());
      int[] info = new int[2];
      info[0] = Integer.parseInt(st.nextToken());
      info[1] = Integer.parseInt(st.nextToken());
      list.add(info);
    }

    Collections.sort(list, new Comparator<int[]>() {
      @Override
      public int compare(int[] i1, int[] i2){
        if(i1[0] == i2[0]) return i1[1] - i2[1];
        return i1[0] - i2[0];
      }
    });

    for(int[] i : list){
      sb.append(i[0]).append(" ").append(i[1]).append("\n");
    }
    System.out.print(sb);
  }
  public static void main(String[] args) throws Exception{
    new Main().solution();
  }
}
