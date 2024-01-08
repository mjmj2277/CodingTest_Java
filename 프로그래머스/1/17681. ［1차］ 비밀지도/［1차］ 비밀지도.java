import java.util.*;

class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];       
        
        for(int i = 0; i < n; i++) {
            String binaryString = Integer.toBinaryString(arr1[i] | arr2[i]);
            binaryString = String.format("%" + n + "s", binaryString).replace(' ', '0');
            answer[i] = binaryString.replaceAll("1", "#").replaceAll("0"," ");           
        }
        
        return answer;
    }
}