import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
  class Paper{
    int priority;
    int idx;
    Paper(int priority, int idx){
      this.priority = priority;
      this.idx = idx;
    }
  }
  public void solution() throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int T = Integer.parseInt(br.readLine());
    for(int t=0; t<T; t++){
      StringTokenizer st = new StringTokenizer(br.readLine());
      int n = Integer.parseInt(st.nextToken());
      int m = Integer.parseInt(st.nextToken());

      st = new StringTokenizer(br.readLine());
      Queue<Paper> queue = new LinkedList<>();
      int cnt = 0, max = 0;
      for(int i=0; i<n; i++){
        int tmp = Integer.parseInt(st.nextToken());
        queue.add(new Paper(tmp, i));
        max = Math.max(max, tmp);
      }

      while(!queue.isEmpty()){
        if(queue.peek().priority == max){
          cnt++;
          if(queue.peek().idx == m){
            System.out.println(cnt);
            break;
          }
          queue.poll();
          max = 0;
          for(Paper paper: queue){
            max = Math.max(paper.priority, max);
          }
        }
        else{
          queue.add(queue.poll());
        }
      }
    }

  }
  public static void main(String[] args) throws Exception{
    new Main().solution();
  }
}
