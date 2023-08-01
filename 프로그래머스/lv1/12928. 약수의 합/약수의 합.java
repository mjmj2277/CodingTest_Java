import java.util.*;
class Solution {
    public int solution(int n) {
        int answer = 0;
        List<Integer> list1 = new ArrayList<>();
        
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                list1.add(i); 
            }
        }
        for(int i = 0; i < list1.size(); i++){
            answer += list1.get(i);
        }
        return answer;
    }
}