import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    static int n;
    static int[] iarr;
    static boolean[] isVisited;
    static List<Integer> list = new ArrayList<>();
    static int max = 0;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        iarr = new int[n];
        isVisited = new boolean[n+1];

        for(int i=0; i<n; i++){
            iarr[i] = Integer.parseInt(st.nextToken());
        }

        dfs();

        System.out.println(max);
    }

    static void dfs(){
        if(list.size() == n){
            max = Math.max(listSum(list), max);
            return;
        }

        for(int i=0; i<n; i++){
            if(!isVisited[i]){
                isVisited[i] = true;
                list.add(iarr[i]);
                dfs();
                list.remove(list.size()-1);
                isVisited[i] = false;
            }
        }
    }

    static int listSum(List<Integer> list){
        int sum = 0;
        for(int i=0; i<list.size()-1; i++){
            sum += Math.abs(list.get(i) - list.get(i+1));
        }

        return sum;
    }
}
