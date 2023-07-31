import java.util.*;
class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        // int idx = 0;
        // idx = idx  + ((k-1) * 2);
        // idx = idx % numbers.length;
        // answer = numbers[idx];        
        int idx2 = 0;
        for(int i = 0; i < k-1; i++){
            idx2 += 2;
            if(idx2 >= numbers.length){
                idx2 = idx2 - numbers.length;
            }
        }
        answer = numbers[idx2];
        return answer;
    }
}