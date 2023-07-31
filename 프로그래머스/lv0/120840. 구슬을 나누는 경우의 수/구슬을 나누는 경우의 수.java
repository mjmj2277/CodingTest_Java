class Solution {
    public Long solution(int balls, int share) {
        Long answer = 1L;  
        if(balls == share){
            return 1L;
        }

        int min = Math.min(share, balls-share); 
        for(int i = 0; i < min; i++){
            answer = answer * balls;
            balls = balls - 1;
            answer = answer / (i + 1);
        }

        //answer = Factorial(balls) / (Factorial(share) * Factorial(balls - share));        
        return answer;
    }
    
    // public static int Factorial(int k){
    //     if(k == 1){
    //         return 1;
    //     }
    //     return k * Factorial(k-1);
    // }
}