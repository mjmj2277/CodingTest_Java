class Solution {
    public String solution(String phone_number) {
        
        String answer = "";
        String[] a = phone_number.split("");
      
        for(int i = 0; i < a.length - 4;i++) {
            answer += "*";
        }
               
        for(int i = a.length - 4; i < a.length; i++) {
            answer += a[i];
        }
        
        return answer;
    }
}