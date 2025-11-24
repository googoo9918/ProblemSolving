public class Main {
    public static void main(String[] args) {
        boolean[] barr = new boolean[10001];

        for(int i=1; i<=10000; i++){
            int tmp = i;
            tmp = construct(tmp);
            while(tmp <= 10000){
                if(!barr[tmp]){
                    barr[tmp] = true;
                }
                tmp = construct(tmp);
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int i=1; i<=10000; i++){
            if(!barr[i]){
                sb.append(i);
                sb.append("\n");
            }
        }

        System.out.println(sb);
    }

    public static int construct(int tmp){
        int ans = tmp;
        while(tmp > 0){
            ans += tmp%10;
            tmp /= 10;
        }

        return ans;
    }
}
