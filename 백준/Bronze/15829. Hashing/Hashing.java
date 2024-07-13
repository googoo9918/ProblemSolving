import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
  public void solution() throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    String s = br.readLine();
    int sum = 0;
    for(int i=0; i<n; i++){
      int tmp = s.charAt(i)-'a'+1;
      for(int j=0; j<i; j++){
        tmp *= 31;
      }
      sum += tmp;
    }
    System.out.println(sum);
  }
  public static void main(String[] args) throws Exception{
    new Main().solution();
  }
}
