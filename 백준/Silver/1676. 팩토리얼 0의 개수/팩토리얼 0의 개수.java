import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class Main {
  public void solution() throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int cnt = 0;
    for(int i=1; i<=n; i++){
      cnt += countFive(i);
    }
    System.out.println(cnt);
  }
  public int countFive(int i){
    int cnt = 0;
    while(i>0){
      if(i%5 == 0){
        cnt++;
        i/=5;
      }
      else{
        break;
      }
    }
    return cnt;
  }
  public static void main(String[] args) throws Exception{
    new Main().solution();
  }

}
