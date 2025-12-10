import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] iarr = new int[10];

        while(n>0){
            iarr[n%10]++;
            n /= 10;
        }

        int max = 0;
        for(int i=0; i<=9; i++){
            if(i==6 || i==9) continue;

            max = Math.max(iarr[i], max);
        }

        if((iarr[6] + iarr[9]+1)/2 > max){
            max = (iarr[6] + iarr[9]+1)/2;
        }

        System.out.println(max);
    }
}
