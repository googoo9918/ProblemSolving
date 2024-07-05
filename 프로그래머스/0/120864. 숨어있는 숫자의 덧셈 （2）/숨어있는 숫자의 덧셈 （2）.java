class Solution {
    public int solution(String my_string) {
        int sum = 0;
        for(int i=0; i<my_string.length(); i++){
            if(Character.isDigit(my_string.charAt(i))){
                int tmp = 0;
                for(int j=i; j<my_string.length(); j++){
                    if(Character.isDigit(my_string.charAt(j))){
                        tmp *= 10;
                        tmp += Integer.parseInt(String.valueOf(my_string.charAt(j)-'0'));
                        i++;
                        System.out.println("tmp:" + tmp);
                    }
                    else break;
                }
                sum += tmp;
            }
        }
        return sum;
    }
}