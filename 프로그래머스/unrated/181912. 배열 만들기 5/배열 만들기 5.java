import java.util.*;
class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> list1 = new ArrayList<>();
        
        for(int i = 0; i < intStrs.length; i ++){
            if(Integer.parseInt(intStrs[i].substring(s,s+l)) > k){
                list1.add(Integer.parseInt(intStrs[i].substring(s,s+l)));                
            }       
        }
        int[] answer = new int[list1.size()];
        for(int i = 0; i < answer.length; i++){
            answer[i] = list1.get(i);
        }
        return answer;
    }
}