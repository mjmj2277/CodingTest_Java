class Solution {
    public int solution(String my_string, String target) {
        int answer = 0;
        String a = my_string.replaceAll(target,"");
        if (a.length() != my_string.length()){
            answer = 1;
        } 
        return answer;
    }
}