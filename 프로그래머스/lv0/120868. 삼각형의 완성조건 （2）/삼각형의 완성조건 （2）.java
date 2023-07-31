import java.util.*;

class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        List<Integer> intList = new ArrayList<>();
        for(int i = 0; i < sides.length; i++) {
            intList.add(sides[i]);
        }
        int maxNum = Collections.max(intList);
        int minNum = Collections.min(intList);
        int count = 0;
        for(int i = maxNum+1; i < maxNum + minNum; i++) {
            // System.out.println(i);
            count++;
        }
        for(int i = maxNum-minNum+1; i <= maxNum; i++) {
            // System.out.println(i);
            count++;
        }
        System.out.println(count);
        
        return count;
    }
}