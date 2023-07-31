import java.util.*;
class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] a = s.split(" ");        
        List<Integer> list1 = new ArrayList<>();
        int check = 0;
        for(int i = 0; i < a.length; i++){            
            if(!a[i].equals("Z")){                
                list1.add(Integer.parseInt(a[i]));               
            }else{
                if(!a[0].equals("Z")){
                    list1.remove(list1.size()-1);                    
                }
            }
        }       
        for(int b : list1){
            answer += b;
        }
        
        return answer;
    }
}