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
    int n = Integer.parseInt(br.readLine());
    List<String[]> list = new ArrayList<>();

    for(int i=0; i<n; i++){
      StringTokenizer st = new StringTokenizer(br.readLine());
      String[] stmp = new String[2];
      stmp[0] = st.nextToken();
      stmp[1] = st.nextToken();
      list.add(stmp);
    }

    Collections.sort(list, new Comparator<String[]>(){
      @Override
      public int compare(String[]s1, String[] s2){
        if((Integer.parseInt(s1[0]) == Integer.parseInt(s2[0]))) return 0;
        return Integer.parseInt(s1[0]) - Integer.parseInt(s2[0]);
      }
    });

    StringBuilder sb = new StringBuilder();
    for(String[] s : list){
      sb.append(s[0]).append(" ").append(s[1]).append("\n");
    }
    System.out.println(sb);
  }
  public static void main(String[] args) throws Exception{
    new Main().solution();
  }
}
