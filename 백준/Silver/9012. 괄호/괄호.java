import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
  public void solution() throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    String s;
    StringBuilder sb = new StringBuilder();
    for(int i=0; i<n; i++){
      Stack<Character> stack = new Stack<>();
      s = br.readLine();
      boolean check = true;
      for(int j=0; j<s.length(); j++){
        if(s.charAt(j) == '('){
          stack.push('(');
        }
        else if(s.charAt(j) == ')'){
          if(stack.size()>0 && stack.peek() == '('){
            stack.push(')');
            stack.pop();
            stack.pop();
          }
          else{
            stack.push(')');
            break;
          }
        }
      }
      sb.append(stack.size()==0 ? "YES" : "NO").append("\n");
    }
    System.out.println(sb);
  }
  public static void main(String[] args) throws Exception{
    new Main().solution();
  }
}
