import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
  public void solution() throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String s = "";
    while(!(s = br.readLine()).equals("0")){
      StringBuilder sb = new StringBuilder(s).reverse();
      if (s.equals(sb.toString())) {
        System.out.println("yes");
      } else {
        System.out.println("no");
      }
    }
  }
  public static void main(String[] args) throws Exception{
    new Main().solution();
  }
}
