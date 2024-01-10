import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        List<Integer> scoresList = new ArrayList<>();
        
        for (int i = 0; i < score.length; i++) {
            scoresList .add(score[i]);
            
            if(scoresList .size() > k) {
                scoresList.remove(Collections.min(scoresList));
            }       
            
            answer[i] = Collections.min(scoresList);
        }
        
        return answer;
    }
}