import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
  public void solution() throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    PriorityQueue<Integer> pq = new PriorityQueue<>();
    for(int i=0; i<n; i++){
      StringTokenizer st = new StringTokenizer(br.readLine());
      for(int j=0; j<n; j++){
        int tmp = Integer.parseInt(st.nextToken());
        if(pq.size()<n){
          pq.add(tmp);
        }
        else if(pq.peek()<tmp){
          pq.poll();
          pq.add(tmp);
        }
      }
    }
    System.out.println(pq.peek());
  }
  public static void main(String[] args) throws Exception{
    new Main().solution();
  }
}
