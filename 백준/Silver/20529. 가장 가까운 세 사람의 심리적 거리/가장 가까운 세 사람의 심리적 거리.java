import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

  public void solution() throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine());
    for(int i=0; i<t; i++){
      int n = Integer.parseInt(br.readLine());
      String[] mbti = br.readLine().split(" ");
      int minDistance = Integer.MAX_VALUE;
      if(n>32) System.out.println(0);
      else{
        for(int j=0; j<n-2; j++){
          for(int k=j+1; k<n-1; k++){
            for(int l=k+1; l<n; l++){
              int distance = calculateDistance(mbti[j], mbti[k]) +
                  calculateDistance(mbti[j], mbti[l]) +
                  calculateDistance(mbti[k], mbti[l]);
              minDistance = Math.min(minDistance, distance);
            }
          }
        }
        System.out.println(minDistance);
      }
    }
  }
  public int calculateDistance(String a, String b){
    int distance = 0;
    for(int i=0; i<a.length(); i++){
      if(a.charAt(i) != b.charAt(i)) distance++;
    }
    return distance;
  }
  public static void main(String[] args) throws Exception{
    new Main().solution();
  }
}
