import java.util.*;
class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        List<Integer> list1 = new ArrayList<>();
        
        for(int a : arr){
            if(!list1.contains(a)){
                list1.add(a);
            }
        }
        Arrays.fill(answer,-1);
        int a = Math.min(list1.size(), answer.length);
        for(int i = 0; i < a; i++){            
            answer[i] = list1.get(i);            
        }       

        return answer;
    }
}