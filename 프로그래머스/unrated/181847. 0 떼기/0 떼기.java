class Solution {
    public String solution(String n_str) {
        String answer = "";
        while(n_str.substring(0,1).equals("0")){
            n_str = n_str.replaceFirst("0","");
        }
        answer = n_str;

        return answer;
    }
}