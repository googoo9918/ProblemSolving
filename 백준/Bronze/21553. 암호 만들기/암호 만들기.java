import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
  public void solution() throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String a = br.readLine();
    String p = br.readLine();
    System.out.println(p);
  }
  public static void main(String[] args) throws Exception{
    new Main().solution();
  }

}
