import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String input = br.readLine();
            List<String> list = new ArrayList<>(List.of(input.split(" ")));
            Set<String> set = new HashSet<>();

            while(true){
                String records = br.readLine();
                if(records.equals("what does the fox say?")) break;
                String record = records.split(" ")[2];
                set.add(record);
            }

            list.removeAll(set);

            StringBuilder sb = new StringBuilder();

            for(String s : list){
                sb.append(s).append(" ");
            }

            System.out.println(sb);
        }
    }
}
