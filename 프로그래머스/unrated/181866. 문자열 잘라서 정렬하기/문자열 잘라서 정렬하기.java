import java.util.*;
class Solution {
    public String[] solution(String myString) {        
        // String[] answer = myString.split("x");
        // Arrays.sort(answer);
        List<String> list1 = new ArrayList<>();
        String[] a = myString.split("x");
        for(int i = 0; i < a.length; i++){
            if(!a[i].equals("")){
                list1.add(a[i]);
            }
        }
        Collections.sort(list1);
        String[] answer = new String[list1.size()];
        for(int i = 0; i < answer.length; i++){
            answer[i] = list1.get(i);
        }
        System.out.print(Arrays.toString(answer));
        return answer;
    }
}