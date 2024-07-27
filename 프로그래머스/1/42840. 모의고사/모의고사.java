class Solution {
    public int[] solution(int[] answers) {
        int[] airr = new int[]{1,2,3,4,5};
        int[] birr = new int[]{2,1,2,3,2,4,2,5};
        int[] cirr = new int[]{3,3,1,1,2,2,4,4,5,5};
        int a =0, b=0, c=0;
        
        for(int i=0; i<answers.length; i++){
            if(answers[i] == airr[i%5]) a++;
            if(answers[i] == birr[i%8]) b++;
            if(answers[i] == cirr[i%10]) c++;
        }
        if(a==b && a==c) return new int[]{1,2,3};
        else if(a>b && a>c) return new int[]{1};
        else if(b>a && b>c) return new int[]{2};
        else if(c>a && c>b) return new int[]{3};
        else if(a==b && a>c) return new int[]{1,2};
        else if(a==c && a>b) return new int[]{1,3};
        else if(b==c && b>a) return new int[]{2,3};
        int[] answer = {};
        return answer;
    }
}