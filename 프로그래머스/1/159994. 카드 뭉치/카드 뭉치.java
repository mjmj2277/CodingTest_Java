import java.util.*;
class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "";
        int c1_idx = 0;
        int c2_idx = 0;
        
        for(int i = 0; i < goal.length; i++){
            if(c1_idx < cards1.length && goal[i].equals(cards1[c1_idx])){
                answer = "Yes";
                c1_idx++;
                
            } else if(c2_idx < cards2.length && goal[i].equals(cards2[c2_idx])){                         
                answer = "Yes";
                c2_idx++;
            } else {
                answer = "No";
                break;
            }
        }
       
        return answer;
    }
}