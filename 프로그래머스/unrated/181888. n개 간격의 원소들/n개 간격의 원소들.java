import java.util.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
        List<Integer> list1 = new ArrayList<>();
      
        for ( int i = 0; i < num_list.length; i = i + n){
            list1.add(num_list[i]);
        }
       
        int[] answer = new int[list1.size()];
        for(int i = 0; i < answer.length; i++){
            answer[i] = list1.get(i);
        }               
        return answer;
    }
}
