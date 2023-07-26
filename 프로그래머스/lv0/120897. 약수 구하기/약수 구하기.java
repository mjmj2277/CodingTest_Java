import java.util.*;
class Solution {
    public int[] solution(int n) {
        List<Integer> list1 = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                list1.add(i);
            }            
        }
        System.out.print(list1);
        int[] answer = new int[list1.size()];
        for(int i = 0; i < answer.length; i++){
            answer[i] = list1.get(i);
        }
        return answer;
    }
}