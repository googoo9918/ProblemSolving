import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        String[] sarr = new String[n];

        for(int i=0; i<n; i++){
            sarr[i] = br.readLine();
        }

        int min = Math.min(n, m);
        int ans = 1;
        for(int i=1; i<min; i++){
            for(int j=0; j<=n-i-1; j++){
                for(int k=0; k<=m-i-1; k++){
                    if(sarr[j].charAt(k) == sarr[j].charAt(k+i) && sarr[j].charAt(k) == sarr[j+i].charAt(k) && sarr[j].charAt(k)== sarr[j+i].charAt(k+i)){
                        ans = (i+1) * (i+1);
                    }
                }
            }
        }

        System.out.println(ans);
    }
}
