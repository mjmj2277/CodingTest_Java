import java.util.*;
class Solution {
    public String[] solution(String[] names) {
        List<String> list1 = new ArrayList<>();
        for(int i = 0; i < names.length; i = i + 5){
            list1.add(names[i]);
        }
        String[] answer = new String[list1.size()];
        for(int i = 0; i < answer.length; i++){
            answer[i] = list1.get(i);
        }
        return answer;    
    }    
    
}