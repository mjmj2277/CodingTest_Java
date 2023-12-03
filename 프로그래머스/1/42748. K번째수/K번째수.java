import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];              
        
        for(int a = 0; a < commands.length; a++) {
            int i = commands[a][0] - 1;
            int j = commands[a][1] - 1;
            int k = commands[a][2] - 1;
            
            List<Integer> temp = new ArrayList<>();
            for(int b = i; b <= j; b++) {
                temp.add(array[b]);
            }
            
            Collections.sort(temp);
            answer[a] = temp.get(k);
        }       
        
        return answer;
    }
}