import java.util.*;
class Solution {
    public String[] solution(String my_str, int n) {
        String l = "";        
        List<String> list1 = new ArrayList<>();      
        char[] arr = my_str.toCharArray();        
        for(int i = 0; i < arr.length; i = i + n){
            for(int j = i; j < i + n; j++){
                // if(arr.length <= j){
                //     break;
                // }
                // l += String.valueOf(arr[j]);
                if(j < arr.length){
                    l += String.valueOf(arr[j]);  
                }
            }
            list1.add(l);
            l="";
        }
                
        String[] answer = new String[list1.size()];
        for(int i = 0; i < answer.length; i++){
            answer[i] = list1.get(i);
        }
        return answer;
    } 
}