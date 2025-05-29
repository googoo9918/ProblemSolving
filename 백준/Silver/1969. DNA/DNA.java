import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        String[] hdistance = new String[n];

        for (int i = 0; i < n; i++) {
            hdistance[i] = br.readLine();
        }

        TreeMap<Character, Integer> map = new TreeMap<>();

        StringBuilder sb = new StringBuilder();
        int cnt = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                char c = hdistance[j].charAt(i);
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
            Character key = Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();
            sb.append(key);
            cnt += n - map.get(key);
            map.clear();
        }

        System.out.println(sb);
        System.out.println(cnt);
    }
}
