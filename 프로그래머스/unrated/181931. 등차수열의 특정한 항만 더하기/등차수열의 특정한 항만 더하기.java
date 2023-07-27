import java.util.*;
class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        List<Integer> list1 = new ArrayList<>();
    
        for(int i = 0; i < included.length; i ++){
             if(included[i]){
                list1.add( a + (d * i));
             }
        }
        
        //int[] a = new int[list1.size()];
        for(int i = 0; i < list1.size(); i++){
            answer += list1.get(i);
        }
    
        
        return answer;
    }
}