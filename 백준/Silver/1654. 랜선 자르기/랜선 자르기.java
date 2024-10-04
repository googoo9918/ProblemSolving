import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public void solution() throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int k = Integer.parseInt(st.nextToken());
    int n = Integer.parseInt(st.nextToken());
    int[] lan = new int[k];
    int max=Integer.MIN_VALUE;
    for(int i=0; i<k; i++){
      lan[i] = Integer.parseInt(br.readLine());
      max = Math.max(max, lan[i]);
    }

    long left = 1;
    long right = max;
    long result = 0;
    while(left<=right){
      long mid = (left+right)/2;
      int cnt = 0;
      for(int i=0; i<k; i++){
        cnt += lan[i]/mid;
      }

      if(cnt>= n){
        result = mid;
        left = mid+1;
      }else{
        right = mid-1;
      }
    }

    System.out.println(result);
  }
  public static void main(String[] args) throws Exception{
    new Main().solution();
  }
}
