import java.util.*;

class Solution {
    public int solution(String binomial) {
        int answer = 0;
        String a = binomial.replaceAll("[0-9]","").trim();
        String[] b = binomial.split("\\"+a);
        int c = Integer.parseInt(b[0].trim());
        int d = Integer.parseInt(b[1].trim());
        if(a.equals("+")){
            answer = c+ d;
        } else if (a.equals("-")){
            answer = c - d;
        } else if (a.equals("*")){
            answer = c * d;
        }
        return answer;
    }
}