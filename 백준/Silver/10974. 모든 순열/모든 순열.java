import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static int n;
    static List<Integer> list = new ArrayList<>();
    static boolean[] isVisited;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        isVisited = new boolean[n+1];

        dfs();
        System.out.println(sb);
    }

    private static void dfs(){
        if(list.size() == n){
            for(int i : list){
                sb.append(i).append(" ");
            }
            sb.append("\n");
        }

        for(int i=1; i<=n; i++){
            if (!isVisited[i]) {
                isVisited[i] = true;
                list.add(i);
                dfs();
                list.remove(list.size() - 1);
                isVisited[i] = false;
            }
        }
    }
}
