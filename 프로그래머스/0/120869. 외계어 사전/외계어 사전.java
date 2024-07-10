class Solution {
    public int solution(String[] spell, String[] dic) {
        boolean check = true;
        for(int i=0; i<dic.length; i++){
            check = true;
            for(int j=0; j<spell.length; j++){
                if(dic[i].indexOf(spell[j]) == -1){
                    check = false;
                    break;
                }
            }
            if(check == true) break;
        }
        return check ? 1 : 2;
    }
}