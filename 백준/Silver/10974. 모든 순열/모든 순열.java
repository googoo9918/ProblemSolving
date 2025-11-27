import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static boolean[] isVisited;
    static List<Integer> list = new ArrayList<>();
    static int n;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        isVisited = new boolean[n+1];
        dfs();
    }

    private static void dfs() {
        if(list.size() == n){
            StringBuilder sb = new StringBuilder();
            for(int i : list){
                sb.append(i).append(" ");
            }

            System.out.println(sb);
        }

        for(int i=1; i<=n; i++){
            if(!isVisited[i]){
                isVisited[i] = true;
                list.add(i);
                dfs();
                list.remove(list.size()-1);
                isVisited[i] = false;
            }
        }
    }
}
