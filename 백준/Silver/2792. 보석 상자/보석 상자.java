import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  static int n,m;
  static int[] jewels;
  public void solution() throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    n = Integer.parseInt(st.nextToken());
    m = Integer.parseInt(st.nextToken());
    jewels = new int[m];
    int left=1, right = 0;
    for(int i=0; i<m; i++){
      jewels[i] = Integer.parseInt(br.readLine());
      right = Math.max(right,jewels[i]);
    }

    int ans = Integer.MAX_VALUE;
    while(left<=right){
      int mid = left + (right-left)/2;
      int cnt = 0;

      for(int i=0; i<m; i++){
        int quo = jewels[i]/mid;
        int rem = jewels[i]%mid;

        if(rem == 0) cnt += quo;
        else{
          cnt += quo+1;
        }
      }

      if(cnt>n){
        left = mid+1;
      }else{
        right = mid-1;
        ans = Math.min(ans,mid);
      }
    }
    System.out.println(ans);
  }
  public static void main(String[] args) throws Exception{
    new Main().solution();
  }
}
