import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String man = br.readLine();
        String her = br.readLine();

        int[] alphabetCnt = new int[]{3,2,1,2,3,3,2,3,3,2,2,1,2,2,1,2,2,2,1,2,1,1,1,2,2,1};
        int len = man.length() + her.length();
        List<Integer> ans = new ArrayList<>();
        int mx = 0, hx = 0;
        while(ans.size()!=len){
            ans.add(alphabetCnt[man.charAt(mx++) - 'A']);
            ans.add(alphabetCnt[her.charAt(hx++) - 'A']);
        }

        while(ans.size() != 2){
            List<Integer> newAns = new ArrayList<>();
            for(int i=0; i<ans.size()-1; i++){
                newAns.add((ans.get(i) + ans.get(i + 1)) % 10);
            }
            ans.clear();
            ans.addAll(newAns);
        }

        if(ans.get(0) == 0){
            String answer = "0" + ans.get(1);
            System.out.println(answer);
        }
        else{
            System.out.println(ans.get(0) * 10 + ans.get(1));
        }
    }
}
