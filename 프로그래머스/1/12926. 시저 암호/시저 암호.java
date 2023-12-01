class Solution {
    public String solution(String s, int n) {
        String answer = "";
        
        for(int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            
            if(currentChar >= 'A' && currentChar <= 'Z') {
                answer += (char)((currentChar - 'A' + n) % 26 + 'A');
            } else if(currentChar >= 'a' && currentChar <= 'z') {
                answer += (char)((currentChar - 'a' + n) % 26 + 'a');
            } else if(currentChar == ' ') {
                answer += " ";
            } else {
                answer += currentChar;
            }
        }
        return answer;
    }
}