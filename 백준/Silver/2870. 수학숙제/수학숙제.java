import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<String> list = new ArrayList<>();

        for(int i=0; i<n; i++){
            String line = br.readLine().replaceAll("[^0-9]", " ");
            String[] sarr = line.split(" ");

            for(int j=0; j<sarr.length; j++){
                if(!sarr[j].isEmpty()){
                    //0한개만 나온 경우를 제외하고 0은 제외하고 받아야 한다.
                    int idx = 0;
                    while(idx<sarr[j].length()-1 && sarr[j].charAt(idx) == '0') idx++;
                    list.add(sarr[j].substring(idx));
                }
            }
        }

        Collections.sort(list, new Comparator<String>(){

            @Override
            public int compare(String s1, String s2){
                if(s1.length() != s2.length()) return s1.length() - s2.length();
                return s1.compareTo(s2);
            }
        });

        for(String s : list){
            System.out.println(s);
        }
    }
}
