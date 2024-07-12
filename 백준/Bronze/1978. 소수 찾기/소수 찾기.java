import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public void solution() throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int[] arr = new int[n];
    StringTokenizer st = new StringTokenizer(br.readLine());
    for (int i = 0; i < arr.length; i++) {
      arr[i] = Integer.parseInt(st.nextToken());
    }

    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      boolean check = true;
      for (int j = 2; j <= Math.sqrt(arr[i]); j++) {
        if (arr[i] % j == 0) {
          check = false;
        }
      }
      if(check && arr[i]>=2) sum++;
    }
    System.out.println(sum);
  }
  public static void main(String[] args) throws Exception{
    new Main().solution();
  }
}
