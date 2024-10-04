import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

public class Main {
  public void solution() throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int[] narr = new int[n];
    int min=Integer.MAX_VALUE, max=Integer.MIN_VALUE, modeTmp=0;
    double sum = 0;
    int[] modeArr = new int[8001];
    for(int i=0; i<n; i++){
      int tmp = Integer.parseInt(br.readLine());
      narr[i] = tmp;
      sum += tmp;
      min = Math.min(min,tmp);
      max = Math.max(max,tmp);
      modeArr[tmp+4000]++;
      modeTmp = Math.max(modeTmp, modeArr[tmp+4000]);
    }
    Arrays.sort(narr);
    int mid = narr[n/2];
    int cnt = 0, mode =0;
    for(int i=0; i<modeArr.length; i++){
        if(modeArr[i] == modeTmp){
          mode = i-4000;
          cnt++;
          if(cnt==2) break;
        }
    }
    StringBuilder sb = new StringBuilder();
    sb.append(Math.round(sum/n)).append("\n")
        .append(mid).append("\n")
        .append(mode).append("\n")
        .append(max-min);
    System.out.println(sb);
  }
  public static void main(String[] args) throws Exception{
    new Main().solution();
  }
}
