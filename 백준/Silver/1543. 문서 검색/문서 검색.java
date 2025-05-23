import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String text = br.readLine();
        String word = br.readLine();

        int wlen = word.length();
        int ans = 0;

        while(text.contains(word)){
            ans++;
            text = text.substring(text.indexOf(word)+wlen);
        }

        System.out.println(ans);
    }
}
