import java.util.*;
class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] a = my_string.replaceAll("[a-z,A-Z]"," ").trim().split(" ");
        System.out.print(Arrays.toString(a));
        for(int i = 0; i < a.length; i++){
            if(!a[i].equals("")){
                answer += Integer.parseInt(a[i]);
            }
        }
        
        
        // List<Integer> list1 = new ArrayList<>();
        // char[] a = my_string.toCharArray();
        // for(int = 0; i < a.length; i++){
        //     if(Character.isDigit(a[i])){
        //         if(){    
        //             list1.add(a[i]);
        //         }
        //     }
        // }
        
        return answer;
    }
}