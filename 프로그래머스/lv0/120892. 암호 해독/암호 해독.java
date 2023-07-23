import java.util.*;
class Solution {
    public String solution(String cipher, int code) { 
        String answer = "";
        List<String> list1 = new ArrayList<>();
        String[] a = cipher.split("");
        for(int i = code - 1; i < a.length; i = i + code){
            list1.add(a[i]);            
        }        
        for(int i = 0; i < list1.size(); i++){
            answer += list1.get(i);
        }       
        return answer;
    }
}