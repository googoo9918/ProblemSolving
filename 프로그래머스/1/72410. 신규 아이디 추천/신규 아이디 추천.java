class Solution {
    public String solution(String new_id) {
        new_id = new_id.toLowerCase().replaceAll("[^a-z0-9\\-\\_\\.]", "").replaceAll("[.]{2,}", ".");
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<new_id.length(); i++){
            sb.append(new_id.charAt(i));
        }
        
        while(sb.toString().startsWith(".")) sb.deleteCharAt(0);
        while(sb.toString().endsWith(".")) sb.deleteCharAt(sb.length()-1);
        
        if(sb.length() == 0) sb.append("a");
        
        if(sb.length() > 15) sb.setLength(15);
        while(sb.toString().endsWith(".")) sb.deleteCharAt(sb.length()-1);
        
        while(sb.length()<3){
            sb.append(sb.charAt(sb.length()-1));
        }
        
        return sb.toString();
    }
}