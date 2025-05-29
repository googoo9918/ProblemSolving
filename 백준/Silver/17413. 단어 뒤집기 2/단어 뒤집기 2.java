import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        boolean flag = false;
        StringBuilder sb = new StringBuilder();
        StringBuilder word = new StringBuilder();

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '<'){
                sb.append(word.reverse());
                word.setLength(0);
                sb.append(s.charAt(i));
                flag = true;
            }else if(s.charAt(i) == '>'){
                sb.append(s.charAt(i));
                flag = false;
            }else if(flag){
                sb.append(s.charAt(i));
            }else if(s.charAt(i) == ' '){
                sb.append(word.reverse());
                sb.append(' ');
                word.setLength(0);
            }else{
                word.append(s.charAt(i));
            }
        }

        sb.append(word.reverse());

        System.out.println(sb);
    }
}
