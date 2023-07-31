import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        List<Integer> list1 = new ArrayList<>();
        int i = 0;
        while(i < arr.length){
            
            if(list1.size() == 0){
                list1.add(arr[i]);
                i++;
            } else {
                if(list1.get(list1.size()-1) < arr[i]){
                    list1.add(arr[i]);
                    i++;
                }else{
                    list1.remove(list1.size()-1);
                }                
            }     
        }
        int[] stk = new int[list1.size()];
        for(int b = 0; b < stk.length; b++){
            stk[b] = list1.get(b);
        }
        
        return stk;
    }
}