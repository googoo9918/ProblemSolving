import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
  public void solution() throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());
    HashSet<String> hash = new HashSet<>();
    for(int i =0; i<n; i++){
      hash.add(br.readLine());
    }

    ArrayList<String> same = new ArrayList<>();
    for(int i =0; i<m; i++){
      String s = br.readLine();
      if (hash.contains(s)){
        same.add(s);
      }
    }
    StringBuilder sb = new StringBuilder();
    sb.append(same.size()).append("\n");
    Collections.sort(same);
    for(String s : same){
      sb.append(s).append("\n");
    }
    System.out.println(sb);
  }
  public static void main(String[] args) throws Exception{
    new Main().solution();
  }
}
