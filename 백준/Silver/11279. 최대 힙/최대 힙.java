import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main {
  public void solution() throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
    StringBuilder sb = new StringBuilder();
    for(int i=0; i<n; i++){
      int cal = Integer.parseInt(br.readLine());
      if(cal == 0){
        if(maxHeap.isEmpty()) sb.append(0).append("\n");
        else{
          sb.append(maxHeap.poll()).append("\n");
        }
      }
      else{
        maxHeap.add(cal);
      }
    }
    System.out.println(sb);
  }
  public static void main(String[] args) throws Exception{
    new Main().solution();
  }

}
