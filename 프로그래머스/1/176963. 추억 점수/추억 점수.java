import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        Map<String, Integer> map1 = new HashMap<>();
        
        for(int i = 0; i < name.length; i++){
            map1.put(name[i], yearning[i]);
        }
        
        int[] answer = new int[photo.length];
        
        for(int i = 0; i < photo.length; i++){
            for(int j = 0; j < photo[i].length; j++){
                answer[i] += map1.getOrDefault(photo[i][j], 0);
            }
        }
        
        return answer;
    }
}