class Solution {
    public int solution(String message) {
        int answer = 0;
        String[] a = message.split("");
        answer = a.length * 2;
        return answer;
    }
}