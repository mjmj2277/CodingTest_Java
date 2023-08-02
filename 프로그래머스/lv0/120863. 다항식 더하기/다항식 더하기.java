import java.util.*;
class Solution {
    public String solution(String polynomial) {
        int[] result = {0,0};
        String[] arr = polynomial.split(" ");
        for(int i = 0; i < arr.length; i = i + 2){
            if(arr[i].equals("x")){
                result[1] += 1;
            } else if (arr[i].contains("x")){
                result[1] += Integer.parseInt(arr[i].replace("x",""));
            } else {
                result[0] += Integer.parseInt(arr[i]);
            }
        }
        String answer =  "";
        if(result[0] == 0 && result[1] == 0) {
            answer = "";
        } else if(result[0] == 0){
            if(result[1] == 1) {
                answer = "x";
            } else {
                answer = "" + result[1] + "x";
            }
        } else if (result[1] == 0){
            answer = "" +result[0];
        } else {
            if(result[1] == 1){
                answer = "x + " + result[0];
            } else {
                answer = "" + result[1]  + "x + " + result[0];
            }
        }
        return answer;
    }
}