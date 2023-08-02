import java.util.*;
class Solution {
    public int[] solution(int[] numlist, int n) {
        int[] answer = new int[numlist.length];
        int idx = 0;
        
        for(int i = 0; i < answer.length; i++){
            int min = Integer.MAX_VALUE;
            int min_idx = 0;
            for(int j = 0; j < numlist.length; j++){
                if(Math.abs(numlist[j] - n) < min){
                    min = Math.abs(numlist[j] - n);
                    min_idx = j; 
                }else if(Math.abs(numlist[j] - n) == min){
                    if(numlist[j] > numlist[min_idx]){
                         min_idx = j; 
                    }                
                }
            }
            answer[i] = numlist[min_idx];
            numlist[min_idx] = Integer.MAX_VALUE;
        }
        
        
        
        return answer;
    }
}