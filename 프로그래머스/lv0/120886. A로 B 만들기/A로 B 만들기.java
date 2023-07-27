import java.util.*;

class Solution {
    public int solution(String before, String after) {
        int answer = 1;
        String[] a = before.split("");
        String[] b = after.split("");
  
        Map<String,Integer> map1 = new HashMap<>();
        for(int i = 0; i < a.length; i++){
            map1.put(a[i], map1.getOrDefault(a[i], 0) + 1);
        }
        
        for(int i = 0; i < b.length; i++){
            map1.put(b[i], map1.getOrDefault(b[i], 0) - 1);
             
        }
        for(String key : map1.keySet()){
            int value = map1.get(key);
            if(value != 0) {
                answer = 0;
                break;
            }
            answer = 1;
        }
     
        
        

        return answer;
    }
}