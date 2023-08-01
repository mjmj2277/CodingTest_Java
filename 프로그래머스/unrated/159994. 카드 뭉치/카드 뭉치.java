import java.util.*;
class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "";
        int c1_idx = 0;
        int c2_idx = 0;
        
        for(int i = 0; i < goal.length; i++){
            if(c1_idx < cards1.length && goal[i].equals(cards1[c1_idx])){
                answer = "Yes";
                c1_idx++;
            } else if(c2_idx < cards2.length && goal[i].equals(cards2[c2_idx])){                         
                answer = "Yes";
                c2_idx++;
            } else {
                answer = "No";
                break;
            }
        }
        
        
        
        // int[] a = new int[goal.length];        
        // for(int i = 0; i < goal.length; i++){            
        //     for(int j = 0; j < cards1.length; j++){
        //         if(goal[i].equals(cards1[j])){
        //             a[i] = j;
        //             answer = "Yes"; 
        //         }
        //     }            
        //     for(int j = 0; j < cards2.length; j++){
        //         if(goal[i].equals(cards2[j])){
        //             a[i] = j;
        //             answer = "Yes";
        //         }
        //     }
        // }       
        // List<Integer> list1 = new ArrayList<>();
        // for(int i = 0; i < a.length; i++){
        //     list1.add(a[i]);
        // }
        // Collections.sort(list1);                
        // for(int i = 0; i < a.length; i++){
        //     if(a[i] != list1.get(i)){
        //         answer = "No";
        //     }
        // }       
        return answer;
    }
}