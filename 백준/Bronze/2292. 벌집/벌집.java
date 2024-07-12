import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
  public void solution() throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    if (n == 1)
      System.out.println(1);
    else if (n >= 2 && n <= 7)
      System.out.println(2);
    else {
      int min = 2, max = 7;
      int tmp = 0;
      for (int i = 1; i <= n / 6; i++) {
        min = min + 6 * i;
        max = max + 6 * (i + 1);
        if (n >= min && n <= max){
          tmp = i;
          break;
        }
      }
      System.out.println(tmp + 2);
    }
  }
  // 2~7 12
  //6 6+2 8~19 18
  //12 6*3+2 20~37 24
  //18 6*6+2 38~61...
  public static void main(String[] args) throws Exception{
    new Main().solution();
  }
}
