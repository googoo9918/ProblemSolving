import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {
  public void solution() throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PriorityQueue<Integer> pq = new PriorityQueue<>();
    StringBuilder sb = new StringBuilder();
    int n = Integer.parseInt(br.readLine());
    for(int i=0; i<n; i++){
      int tmp = Integer.parseInt(br.readLine());
      if(tmp>0){
        pq.add(tmp);
      }
      else{
        if(pq.isEmpty()) sb.append(0).append("\n");
        else sb.append(pq.poll()).append("\n");
      }
    }
    System.out.println(sb);
  }
  public static void main(String[] args) throws Exception{
    new Main().solution();
  }
}
