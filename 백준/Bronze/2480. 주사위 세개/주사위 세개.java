import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
  public void solution() throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int[] iarr = new int[3];
    for(int i=0; i<iarr.length; i++){
      iarr[i] = Integer.parseInt(st.nextToken());
    }
    Arrays.sort(iarr);
    StringBuilder sb = new StringBuilder();
    if(iarr[0]==iarr[1] && iarr[1]==iarr[2]){
      sb.append(10000 + iarr[0]*1000);
    }
    else if(iarr[0]==iarr[1] || iarr[1]==iarr[2]){
      sb.append(1000 + iarr[1]*100);
    }
    else{
      sb.append(iarr[2]*100);
    }
    System.out.println(sb.toString());
  }
  public static void main(String[] args) throws Exception{
    new Main().solution();
  }
}
