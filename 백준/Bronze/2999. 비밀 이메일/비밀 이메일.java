import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int len = input.length();
        int r=0, c=0;

        for(int i=1; i<= Math.sqrt(len); i++){
            for(int j=i; j<=len; j++){
                if(i*j == len){
                    r=i;
                    c=j;
                }
            }
        }

        char[][] carr = new char[r][c];
        int idx = 0;
        for(int i=0; i<c; i++){
            for(int j=0; j<r; j++){
                carr[j][i] = input.charAt(idx++);
            }
        }

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                sb.append(carr[i][j]);
            }
        }

        System.out.println(sb.toString());
    }
}
