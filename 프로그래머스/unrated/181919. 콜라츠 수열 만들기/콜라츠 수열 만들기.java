import java.util.*;
class Solution {
    public int[] solution(int n) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(n);
        while(n != 1){
            if(n % 2 == 0){
                list1.add(n / 2);
                n = n / 2;               
            } else {
                list1.add(3 * n + 1);
                n = 3 * n + 1;                
            }
        }
        int[] answer = new int[list1.size()];
        for(int i = 0; i < answer.length; i++){
            answer[i] = list1.get(i);
        }        
        return answer;
    }
}