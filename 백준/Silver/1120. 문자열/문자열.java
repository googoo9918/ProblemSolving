import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public void solution() throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    String s1 = st.nextToken();
    String s2 = st.nextToken();
    int min = Integer.MAX_VALUE;
    for(int i=0; i<=s2.length()-s1.length(); i++){
      int cnt = 0;
      for(int j=0; j<s1.length(); j++){
        if(s1.charAt(j) != s2.charAt(i+j)) cnt++;
      }
      min = Math.min(cnt, min);
    }
    System.out.println(min);
  }
  public static void main(String[] args) throws Exception{
    new Main().solution();
  }
}
