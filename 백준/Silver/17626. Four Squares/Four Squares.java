import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] dp = new int[n+1];

        for(int i=0; i<=n; i++){
            dp[i] = i;

            for(int j=1; j*j<= i; j++){
                int sqrt = j*j;

                dp[i] = Math.min(dp[i], dp[i-sqrt] +1);
            }
        }

        System.out.println(dp[n]);
    }
}
