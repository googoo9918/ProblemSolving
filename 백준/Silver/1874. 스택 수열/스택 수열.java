import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
  public void solution() throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int[] num = new int[n];
    int[] iarr = new int[n];
    StringBuilder sb = new StringBuilder();
    Stack<Integer> stack = new Stack<>();
    //for num, iarr
    int idx1=0, idx2=0;
    //배열 초기화
    for(int i=0; i<n; i++){
      iarr[i] = Integer.parseInt(br.readLine());
      num[i] = i+1;
    }

    while (!(idx1==n && idx2==n)) {
      if(!stack.isEmpty() && stack.peek() == iarr[idx2]){
        stack.pop();
        idx2++;
        sb.append("-").append("\n");
      }
      else{
        stack.push(num[idx1++]);
        sb.append("+").append("\n");
      }

      if (idx1==n && idx2!= n && !stack.isEmpty() && stack.peek()!= iarr[idx2]) {
        sb.setLength(0);
        sb.append("NO");
        break;
      }
    }
    System.out.println(sb);
  }
  public static void main(String[] args) throws Exception{
    new Main().solution();
  }

}
