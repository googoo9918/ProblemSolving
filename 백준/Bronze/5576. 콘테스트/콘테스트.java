import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
  public void solution() throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int[] warr = new int[10];
    int[] karr = new int[10];
    for(int j=0; j<10; j++){
       warr[j] = Integer.parseInt(br.readLine());
    }
    for(int j=0; j<10; j++){
      karr[j] = Integer.parseInt(br.readLine());
    }

    Arrays.sort(warr);
    Arrays.sort(karr);
    int sumw=0, sumk=0;
    for(int i=7; i<=9; i++){
      sumw += warr[i];
      sumk += karr[i];
    }
    System.out.println(sumw + " " + sumk);
  }
  public static void main(String[] args) throws Exception{
    new Main().solution();
  }
}
