import java.util.*;
class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int idx = 0;
        idx = idx  + ((k-1) * 2);
        idx = idx % numbers.length;
        answer = numbers[idx];        
        return answer;
    }
}