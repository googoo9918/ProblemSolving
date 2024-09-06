import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public void solution() throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int[][] baseball = new int[n][3];
    for(int i=0; i<n; i++){
      StringTokenizer st = new StringTokenizer(br.readLine());
      baseball[i][0] = Integer.parseInt(st.nextToken());
      baseball[i][1] = Integer.parseInt(st.nextToken());
      baseball[i][2] = Integer.parseInt(st.nextToken());
    }

    int cnt = 0;
    for(int i=123; i<=987; i++){
      String s = String.valueOf(i);
      if(s.charAt(0) == s.charAt(1) || s.charAt(1) == s.charAt(2) || s.charAt(0) == s.charAt(2))
        continue;
      if(s.contains("0")) continue;

      boolean check = true;
      for(int j=0; j<n; j++){
        String tmp = String.valueOf(baseball[j][0]);
        int strike = 0;
        int ball = 0;
        for(int k=0; k<3; k++){
          if(tmp.charAt(k) == s.charAt(k)) strike++;
          else if(s.contains(String.valueOf(tmp.charAt(k)))) ball++;
        }
        if(strike != baseball[j][1] || ball != baseball[j][2]){
          check = false;
        }
      }
      if(check) cnt++;
    }

    System.out.println(cnt);
  }
  public static void main(String[] args) throws Exception{
    new Main().solution();
  }
}
