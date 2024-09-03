import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public void solution() throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    StringBuilder sb = new StringBuilder();
    int[][] members = new int[n][2];
    for(int i=0; i<n; i++){
      StringTokenizer st = new StringTokenizer(br.readLine());
      members[i][0] = Integer.parseInt(st.nextToken());
      members[i][1] = Integer.parseInt(st.nextToken());
    }

    for(int i=0; i<n; i++){
      int count = 1;
      for(int j=0; j<n; j++){
        if(members[i][0] < members[j][0] && members[i][1] < members[j][1]) count++;
      }
      sb.append(count).append(" ");
    }
    System.out.println(sb);
  }
  public static void main(String[] args) throws Exception{
    new Main().solution();
  }
}
