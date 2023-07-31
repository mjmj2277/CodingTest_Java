import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        List<Integer> list1 = new ArrayList<>();
        for(int a : arr){
            list1.add(a);
        }
        int first2 = list1.indexOf(2);
        int last2 = list1.lastIndexOf(2);
        
        int[] answer = new int[last2-first2+1];
    
        int idx = 0;
        if(first2 != -1 && last2 != -1){
            for(int i = first2; i <= last2; i++){
                answer[idx] = list1.get(i);
                idx++;
            }
        } else{
            answer[0] = -1;
        }
        
        return answer;
    }
}