import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  int white, blue;
  int[][] paper;
  int n;
  public void solution() throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    n = Integer.parseInt(br.readLine());
    paper = new int[n][n];
    for(int i=0; i<n; i++){
      StringTokenizer st = new StringTokenizer(br.readLine());
      for(int j=0; j<n; j++){
        paper[i][j] = Integer.parseInt(st.nextToken());
      }
    }
    
    divide(0,0,n);
    StringBuilder sb = new StringBuilder();
    sb.append(white).append("\n").append(blue);
    System.out.println(sb);
  }

  private void divide(int x, int y, int size) {
    if(checkColor(x, y, size)){
      if(paper[x][y] == 1) blue++;
      else white++;
      return;
    }
    int newSize = size/2;
    divide(x, y, newSize);
    divide(x+newSize, y, newSize);
    divide(x, y + newSize, newSize);
    divide(x+newSize, y+newSize, newSize);
  }

  private boolean checkColor(int x, int y, int size) {
    boolean check = true;
    int tmp = paper[x][y];
    for(int i=x; i<x+size; i++){
      for(int j=y; j<y+size; j++){
        if(tmp!=paper[i][j]){
          check = false;
          break;
        }
      }
    }
    return check;
  }

  public static void main(String[] args) throws Exception{
    new Main().solution();
  }
}
