import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long ans = 0;
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        long[] arr = new long[n+1];
        for(int i=1; i<=n; i++){
            int num = Integer.parseInt(st.nextToken());
            arr[i] = arr[i-1] + num;
            ans += arr[i-1] * num;
        }
        System.out.println(ans);
    }
}