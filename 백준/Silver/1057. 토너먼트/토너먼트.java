import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());

        int cnt = 1;
        for(int i=0; i<=n/2; i++){
            int ktmp = (k+1)/2;
            int ltmp = (l+1)/2;
            if(ktmp == ltmp){
                System.out.println(cnt);
                break;
            }

            k = ktmp;
            l = ltmp;
            cnt++;
        }
    }
}
