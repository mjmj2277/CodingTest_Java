import java.util.*;
class Solution {
    public int solution(int[] nums) {
        Set<Integer> set1 = new HashSet<>();
        int answer = 0;
        for(int a : nums){
            set1.add(a);
        }
        
        if(nums.length / 2 < set1.size()){
            answer = nums.length / 2;
        } else{
            answer = set1.size();
        }
        
        return answer;
    }
}
