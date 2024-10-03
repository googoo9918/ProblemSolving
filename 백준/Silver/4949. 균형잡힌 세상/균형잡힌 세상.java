import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {
  public void solution() throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String s;
    while(!(s = br.readLine()).equals(".")){
      Stack<Character> stack = new Stack<>();
      boolean isBalanced = true;
      for(int i=0; i<s.length(); i++){
        char c = s.charAt(i);
        if(c == '(' || c == '['){
          stack.add(c);
        }
        else if(c == ')'){
          if(!stack.isEmpty() && stack.peek() == '(') stack.pop();
          else{
            isBalanced = false;
            break;
          }
        }
        else if(c== ']'){
          if(!stack.isEmpty() && stack.peek() == '[') stack.pop();
          else{
            isBalanced = false;
            break;
          }
        }
      }
      if(stack.isEmpty() && isBalanced){
        System.out.println("yes");
      }
      else{
        System.out.println("no");
      }
    }
  }
  public static void main(String[] args) throws Exception{
    new Main().solution();
  }
}
