import java.util.*;

class Solution {
    public String solution(String s, String skip, int index) {
        List<Character> list = new ArrayList<>();
        
        for (int i = 0; i < 26; i++) {
            list.add((char)('a' + i));
        }
        
        for (char skipChar : skip.toCharArray()) {
            list.remove(Character.valueOf(skipChar));
        }
        
        StringBuilder sb = new StringBuilder();
        
        for (char c : s.toCharArray()) {
            int idx = list.indexOf(c);
            idx = (idx + index) % list.size();
            sb.append(list.get(idx));
        }
        
        return sb.toString();
    }
}