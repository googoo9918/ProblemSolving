import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        int[] weight = new int[]{1, 3};
        int answer = 0, sum = 0, idx = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                int tmp = s.charAt(i) - '0';
                sum += tmp * weight[i%2];
            } else {
                idx = i;
            }
        }
        for (int i = 1; i <= 9; i++) {
            int tmp = sum + i*weight[idx%2];
            if(tmp%10 == 0){
                answer = i;
                break;
            }
        }

        System.out.println(answer);
    }
}
