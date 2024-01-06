import java.util.*;

class Solution {
    public int[] solution(String s) {        
        int[] answer = new int[s.length()];
        Map<Character, Integer> Map1 = new HashMap<>();
        
        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            
            if (!Map1.containsKey(a)) {
                answer[i] = -1;
            } else {                
                answer[i] = i - Map1.get(a);
            }
            
            Map1.put(a, i);
        }
        
        return answer;
    }
}
