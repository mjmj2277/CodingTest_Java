class Solution {
    public int solution(String number) {
        
        String[] b = number.split("");
        int c = 0;
        for(int i = 0; i < b.length; i++){
            c += Integer.parseInt(b[i]);
        }
        
        int answer = c % 9;
        return answer;
    }
}