import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        String[] a = new String[strings.length];
        
        for(int i = 0; i < strings.length; i++) {
            a[i] = strings[i].charAt(n) + strings[i];
        }
        
        Arrays.sort(a);
        
        for(int i = 0; i < a.length; i++) {           
            answer[i] = a[i].substring(1, a[i].length());
        }
        
        return answer;
    }
}