import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public void solution() throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n1 = Integer.parseInt(st.nextToken());
    int n2 = Integer.parseInt(st.nextToken());
    int min = Math.min(n1,n2);
    int max = Math.max(n1,n2);
    int divMax=1, mulMin=1;
    for(int i=1; i<=min; i++){
      if(n1%i ==0 && n2%i==0){
        divMax = i;
      }
    }
    for(int i=1; i<=max; i++){
      if((min*i)%max==0){
        mulMin = min*i;
        break;
      }
    }
    System.out.println(divMax);
    System.out.println(mulMin);
  }
  public static void main(String[] args) throws Exception{
    new Main().solution();
  }
}
