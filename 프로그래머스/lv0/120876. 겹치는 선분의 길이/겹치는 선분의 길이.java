import java.util.*;
class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        //좌표값이 key 겹치는 수 value
        //선은 도착지 빼고 출발지만 저장한다.
        Map<Integer ,Integer> map1 = new HashMap<>();        
        for(int[] arr : lines){
            for(int i = arr[0]; i < arr[1]; i++){
                map1.put(i, map1.getOrDefault(i, 0) + 1);
            }
        }
        for(int a : map1.keySet()){
            if(map1.get(a) > 1){
                answer++;
            }
        }
        
        return answer;
    }
}