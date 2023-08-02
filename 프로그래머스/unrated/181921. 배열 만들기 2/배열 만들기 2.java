import java.util.*;
class Solution {
    public int[] solution(int l, int r) {
        List<Integer> result = new ArrayList<Integer>();
        for(int i = l; i <= r; i++){
            String a = String.valueOf(i);
            if(!a.contains("1") && !a.contains("2") && !a.contains("3") && !a.contains("4") &&
              !a.contains("6") && !a.contains("7") && !a.contains("8") && !a.contains("9")){
                result.add(i);
            }
        }
        int[] answer = {-1};
        if(result.size() != 0) {
            answer = new int[result.size()];
            for(int i = 0; i < answer.length; i++){
                answer[i] = result.get(i);
            }
        }
        return answer;
    }
}
