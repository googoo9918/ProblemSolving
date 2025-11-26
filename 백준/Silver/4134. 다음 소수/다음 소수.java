import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        for(int i=0; i<t; i++){
            long n = Long.parseLong(br.readLine());

            System.out.println(minPrime(n));
        }
    }

    public static long minPrime(long n){
        for(long i=n; i<Long.MAX_VALUE; i++){
            if(isPrime(i)) return i;
        }

        return 0;
    }

    public static boolean isPrime(long i){
        if(i <= 1) return false;
        for(long j=2; j<=Math.sqrt(i); j++){
            if(i%j == 0) return false;
        }

        return true;
    }
}
