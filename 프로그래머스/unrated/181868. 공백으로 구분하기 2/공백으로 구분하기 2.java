class Solution {
    public String[] solution(String my_string) {
        String a = my_string.trim();
        String[] answer = a.split("\\s+");
        
        return answer;
    }
}