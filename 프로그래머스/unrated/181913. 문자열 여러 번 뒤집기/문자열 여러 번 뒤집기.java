import java.util.*;
class Solution {
    public String solution(String my_string, int[][] queries) {
        //String answer = "";
        for(int i = 0; i < queries.length; i++) {            
            String a = my_string.substring(queries[i][0], queries[i][1]+1);
            String b = my_string.substring(0, queries[i][0]);
            String c = my_string.substring(queries[i][1]+1, my_string.length());
            StringBuffer sb = new StringBuffer(a);
            String d = sb.reverse().toString();
            my_string = b + d + c;         
        }
        
        return my_string;
    }
}