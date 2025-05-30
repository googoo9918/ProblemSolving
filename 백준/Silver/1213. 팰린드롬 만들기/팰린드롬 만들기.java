import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    // Case는 총 3개인 듯
    // 1. 짝수 개수 키
    // 2. 1개짜리 키 1개, 짝수 개수 키
    // 3. 홀수개수 키 1개, 짝수 개수 키
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        TreeMap<Character, Integer> treeMap = new TreeMap<>();

        for (char c : input.toCharArray()) {
            treeMap.put(c, treeMap.getOrDefault(c, 0) + 1);
        }

        boolean isOdd = false;
        char oneKey = ' ';
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : treeMap.entrySet()) {
            char key = entry.getKey();
            int value = entry.getValue();

            if(value % 2 == 1){
                if(isOdd){
                    System.out.println("I'm Sorry Hansoo");
                    return;
                }else{
                    isOdd = true;
                    oneKey = key;
                    value--;
                }
            }
            for(int i=0; i<value/2; i++){
                sb.append(key);
            }
        }
        StringBuilder tmpSb = new StringBuilder(sb);
        if(isOdd) sb.append(oneKey);

        sb.append(tmpSb.reverse());

        System.out.println(sb);
    }
}
