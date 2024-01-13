import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;        
        Arrays.sort(score);
        
        int[] score2 = Arrays.copyOfRange(score, score.length % m, score.length);
        
        for (int i = 0; i < score2.length; i += m) {
            answer += score2[i] * m;
        }
        
        return answer;
    }
}