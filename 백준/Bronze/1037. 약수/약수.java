import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] iarr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            iarr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(iarr);

        if(iarr.length % 2 != 0){
            System.out.println(iarr[iarr.length / 2] * iarr[iarr.length / 2]);
        } else{
            System.out.println(iarr[0] * iarr[iarr.length-1]);
        }

    }
}
