import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  static int n,m;
  static int[] iarr;
  public void solution() throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    n = Integer.parseInt(st.nextToken());
    m = Integer.parseInt(st.nextToken());
    iarr = new int[n];
    int max = 0;
    int sum = 0;
    for(int i=0; i<n; i++){
      iarr[i] = Integer.parseInt(br.readLine());
      max = Math.max(max, iarr[i]);
      sum += iarr[i];
    }

    System.out.println(binarySearch(max, sum));
  }
  private int binarySearch(int low, int high){
    int result = 0;
    while(low<=high){
      int mid = low + (high-low)/2;
      int cnt = 1, sum = mid;
      for(int i=0; i<n; i++){
        if(sum-iarr[i]<0){
          sum = mid;
          cnt++;
        }
        sum -= iarr[i];
      }
      if(cnt > m) low = mid+1;
      else{
        high = mid-1;
        result = mid;
      }
    }
    return result;
  }
  public static void main(String[] args) throws Exception{
    new Main().solution();
  }
}
