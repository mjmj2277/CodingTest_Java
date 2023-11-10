import java.util.*;
class Solution {
    public int[] solution(int[] arr) {       
        List<Integer> list1 = new ArrayList<>();
        for(int a : arr){
            list1.add(a);
        }
        int min = 10000;
        int min_idx = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
                min_idx = i;
            }
        }
        list1.remove(min_idx);
        int[] answer = new int[]{-1};
        if(list1.size() != 0){
            answer = new int[list1.size()];
            for(int i = 0; i < answer.length; i++){
                answer[i] = list1.get(i);
            }
        }
        return answer;
    }
}