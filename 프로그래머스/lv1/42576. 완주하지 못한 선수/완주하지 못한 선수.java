import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> map1 = new HashMap<>();
        String answer = "";
        for(String a : participant){
            map1.put(a, map1.getOrDefault(a, 0) + 1); 
        }
        for(String b : completion){
            map1.put(b, map1.getOrDefault(b, 0) - 1);
        }
        //System.out.println(map1)
        for(String key1 : map1.keySet()){
            // int tmp = map1.get(key1);
            // for(int i = 0; i < tmp; i++){
            //     list.add(key1);
            // }
            if(map1.get(key1) == 1){
                answer = key1;    
            }            
        }
        return answer;
    }
}