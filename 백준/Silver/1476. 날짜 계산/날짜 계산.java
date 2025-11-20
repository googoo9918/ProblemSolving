import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] iarr = new int[3];
        for(int i=0; i<iarr.length; i++){
            iarr[i] = Integer.parseInt(st.nextToken());
        }

        int e = 1, s = 1, m = 1, cnt = 1;
        while(true){
            int[] itmp = new int[]{e, s, m};
            if (Arrays.equals(iarr, itmp)) {
                System.out.println(cnt);
                break;
            }

            cnt++;
            if(++e > 15) e = 1;
            if(++s > 28) s = 1;
            if(++m > 19) m = 1;
        }
    }
}
