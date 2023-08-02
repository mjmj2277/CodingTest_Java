import java.util.*;
class Solution {
    public String solution(String X, String Y) {
        Map<String, Integer> map1 = new HashMap<>();
        List<String> list1 = new ArrayList<>();
        String[] mx = X.split("");
        String[] my = Y.split("");
        for(String a : mx){
            map1.put(a, map1.getOrDefault(a, 0) + 1);
        }
        for(String b : my){
            int tmp = map1.getOrDefault(b, 0);
            if(tmp > 0){
                map1.put(b, tmp-1);
                list1.add(b);
            }           
        }
        Collections.sort(list1, Collections.reverseOrder());
        
        String answer = "";
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < list1.size(); i++){
            sb.append(list1.get(i));
        }
        answer = sb.toString();
        if(list1.size() == 0){
            answer = "-1";
        } else if(list1.get(0).equals("0")){
            answer = "0";
        } 
        
        return answer;
    }
}