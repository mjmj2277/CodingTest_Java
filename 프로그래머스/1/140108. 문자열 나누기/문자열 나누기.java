class Solution {
    public int solution(String s) {
        int answer = 1;
        int count = 1;
        char a = s.charAt(0);
        
        for (int i = 1; i < s.length(); i++) {
            if (count == 0) {
                answer++;
                a = s.charAt(i);
            }
            
            if ( a == s.charAt(i)) {
                count++;
            } else {
                count--;
            }
        }
        return answer;
    }
}