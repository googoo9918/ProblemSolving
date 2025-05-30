import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String pattern = br.readLine();
        String[] startEnd = pattern.split("\\*");
        String start = startEnd[0];
        String end = startEnd[1];
        for(int i=0; i<n; i++){
            String input = br.readLine();
            if (input.length() < start.length() + end.length()) {
                System.out.println("NE");
                continue;
            }
            if (input.startsWith(start) && input.endsWith(end)){
                System.out.println("DA");
            }else{
                System.out.println("NE");
            }
        }
    }
}
