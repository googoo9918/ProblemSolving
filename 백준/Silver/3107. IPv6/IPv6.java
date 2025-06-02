import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String ip = br.readLine();

        if(ip.startsWith("::")) ip = "0" + ip;
        if(ip.endsWith("::")) ip = ip + "0";

        StringBuilder sb = new StringBuilder();

        String[] ips = ip.split(":", -1);
        for(int i=0; i<ips.length; i++){
            if (ips[i].equals("")) {
                int cnt = 8 - ips.length + 1;
                for(int j=0; j<cnt; j++){
                    sb.append("0000:");
                }
            }else{
                for (int j = ips[i].length(); j < 4; j++) {
                    sb.append(0);
                }
                sb.append(ips[i]);
                sb.append(":");
            }
        }

        sb.setLength(sb.length() - 1);

        System.out.println(sb);
    }
}
