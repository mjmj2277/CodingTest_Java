import java.util.*;
class Solution {
    public long[] solution(int x, int n) {
        List<Long> list1 = new ArrayList<>();
      
        for(int i = 1; i <= n; i++){
            list1.add(x+((i-1) * (long)x));//계산 순서 먼저
        }
        
        long[] answer = new long[list1.size()];
        for(int i = 0; i < answer.length; i++){
            answer[i] = list1.get(i);
        }
        
        return answer;
        
       
    }
}