import java.util.*;
class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        int[] answers = new int[3];
        int turn = 0, idx = 0, tmp = 0;
        for(int i=0; i<3; i++){
            int score;
            if (idx < dartResult.length() - 1 && dartResult.charAt(idx) == '1' && dartResult.charAt(idx + 1) == '0') {
                score = 10;
                idx += 2;
            } else {
                score = dartResult.charAt(idx) - '0';
                idx++;
            }
            char c = dartResult.charAt(idx++);
            score = bonus(score, c);
            answers[turn] = score;
            if(idx<dartResult.length() && (dartResult.charAt(idx) == '*' || dartResult.charAt(idx) == '#')){
                answers = option(answers, turn, idx, dartResult);
                idx++;
            }
            turn++;
        }
        
        for(int i:answers){
            answer+= i;
        }
        return answer;
    }
    
    public int bonus(int score, char c){
        if(c == 'S'){
            return score;
        }
        else if(c == 'D'){
            return (int)Math.pow(score, 2);
        }
        else{
            return (int)Math.pow(score, 3);
        }
    }
    
    public int[] option(int[] answers, int turn, int idx, String dartResult){
         if(dartResult.charAt(idx) == '*'){
             if(turn!=0){
                 answers[turn--] *= 2;
                 answers[turn] *= 2;
             }
             else{
                 answers[turn] *= 2;
             }
         }
        else{
            answers[turn] *= -1;
        }
        return answers;
    }
}