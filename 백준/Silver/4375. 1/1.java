import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = br.readLine()) != null) {
            int n = Integer.parseInt(line);

            int mod = 1%n;
            int cnt = 1;
            while(mod != 0){
                mod = (mod * 10 + 1) % n;
                cnt++;
            }

            System.out.println(cnt);
        }
    }
}
