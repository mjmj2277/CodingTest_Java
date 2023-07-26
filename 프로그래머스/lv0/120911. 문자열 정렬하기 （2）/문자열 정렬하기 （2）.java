import java.util.*;
class Solution {
    public String solution(String my_string) {
        List<String> list1 = new ArrayList<>();
        String a = my_string.toLowerCase();
        String[] b = a.split("");
       
        for(int i = 0; i < b.length; i++){
            list1.add(b[i]);
        }
        Collections.sort(list1);
        System.out.print(list1);
        String answer = "";
        for(int i = 0; i < list1.size(); i++){
            answer += list1.get(i);
        }
        return answer;
        }
}