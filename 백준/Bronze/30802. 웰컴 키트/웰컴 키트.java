import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public void solution() throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());

    int[] arr = new int[6];
    StringTokenizer st = new StringTokenizer(br.readLine());
    for(int i=0; i<arr.length; i++){
      arr[i] = Integer.parseInt(st.nextToken());
    }

    st = new StringTokenizer(br.readLine());
    int[] tp = new int[2];
    for (int i = 0; i < tp.length; i++) {
      tp[i] = Integer.parseInt(st.nextToken());
    }

    for(int i=0; i<arr.length; i++){
      if(arr[i]!=0){
      arr[i] = (arr[i]-1)/tp[0] + 1;
      }
    }

    int sum = 0;
    for(int i : arr){
      sum+=i;
    }

    System.out.println(sum);
    System.out.printf(n/tp[1] + " " + n%tp[1]);
  }
  public static void main(String[] args) throws Exception{
    new Main().solution();
  }
}
