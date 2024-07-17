import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
  public void solution() throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String s1 = br.readLine(), s2 = br.readLine(), s3 = br.readLine();
    int tmp = 0;
    if(isNumeric(s1)){
      tmp = Integer.parseInt(s1)+3;
    }else if(isNumeric(s2)){
      tmp = Integer.parseInt(s2)+2;
    }else if(isNumeric(s3)){
      tmp = Integer.parseInt(s3)+1;
    }
    if(tmp%3 ==0 && tmp%5==0){
      System.out.println("FizzBuzz");
    }else if(tmp%3 ==0 && tmp%5 !=0){
      System.out.println("Fizz");
    }else if(tmp%3 !=0 && tmp%5 ==0){
      System.out.println("Buzz");
    }else{
      System.out.println(tmp);
    }
  }
  public static void main(String[] args) throws Exception{
    new Main().solution();
  }
  public boolean isNumeric(String s){
    boolean check = true;
    for (char c : s.toCharArray()) {
      if (!Character.isDigit(c)) {
        check = false;
      }
    }
    return check;
  }
}
