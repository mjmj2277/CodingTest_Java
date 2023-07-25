import java.util.*;
class Solution {
    public int[] solution(int n, int[] numlist) {
        List<Integer> list1 = new ArrayList<>();
        for(int i = 0; i < numlist.length; i++){
            if(numlist[i] % n == 0){
                list1.add(numlist[i]);
            }
        }
        int[] answer = new int [list1.size()];
        for(int i = 0; i < answer.length; i++){
            answer[i] = list1.get(i);
        }
        return answer;
    }
}