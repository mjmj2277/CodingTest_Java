class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
       
        int a = 0;
        int b = 0;
        
        for(int i = 0; i < absolutes.length; i++) {
            if(signs[i] == true) {
                a += absolutes[i];
            } else if(signs[i] == false) {
                b += absolutes[i];
            }
        }
        int answer = a - b;
        return answer;
    }
}