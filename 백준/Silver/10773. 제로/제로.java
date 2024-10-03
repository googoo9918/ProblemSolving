import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {
  public void solution() throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    Stack<Integer> stack = new Stack<>();
    int k = Integer.parseInt(br.readLine());
    for(int i=0; i<k; i++){
      stack.add(Integer.parseInt(br.readLine()));
      if(stack.peek() == 0){
        stack.pop();
        stack.pop();
      }
    }
    int sum = 0;
    for (int i : stack) {
      sum += i;
    }
    System.out.println(sum);
  }
  public static void main(String[] args) throws Exception{
    new Main().solution();
  }
}
