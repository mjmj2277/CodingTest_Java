import java.util.*;
class Solution {
    public String[] solution(String[] picture, int k) {
        List<String> result = new ArrayList<>();
        for(int i = 0; i < picture.length; i++){
            String tmp = "";
            String[] arr = picture[i].split("");
            for(int j = 0; j < arr.length; j++){
                for(int a = 0; a < k; a++){
                    tmp += arr[j];
                }
            }
            for(int j = 0; j < k; j++){
                result.add(tmp);
            }
        }
        String[] answer = result.toArray(new String[0]);
        return answer;
    }
}
