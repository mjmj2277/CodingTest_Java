import java.util.*;
class Solution {
    public int solution(int[] array) {
        int answer = 0;
        Map<Integer,Integer> map1 = new HashMap<>();
        
        for(int i = 0; i < array.length; i++){
            map1.put(array[i], map1.getOrDefault(array[i],0)+1);
        }
        int max = Integer.MIN_VALUE;
        for(int a : map1.keySet()){
            if(max < map1.get(a)){
                max = map1.get(a);
                answer = a;               
            } else if(max == map1.get(a)){
                answer = -1;
            }               
        }
        
        return answer;
    }
}