import java.util.*;

class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        List<String> list1 = new ArrayList<>();
        for(int i = 0; i < todo_list.length; i++){
            if(!finished[i]){
                list1.add(todo_list[i]);
            }
        }
        String[] answer = new String[list1.size()];
        for(int i = 0; i < answer.length; i++){
            answer[i] = list1.get(i);
        }       
        return answer;
    }
}