import java.util.*;

class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {0, 0};
        int a = (board[0] - 1) / 2;
        int b = (board[1] - 1) / 2;
        
        for(String key : keyinput) {
            if(key.equals("up") && answer[1] < b) {
                answer[1] += 1;
            } else if(key.equals("down") && answer[1] > -b) {
                answer[1] -= 1;
            } else if(key.equals("right") && answer[0] < a) {
                answer[0] += 1;
            } else if(key.equals("left") && answer[0] > -a) {
                answer[0] -= 1;
            }
        }
            
        return answer;
    }
}