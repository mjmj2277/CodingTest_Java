class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];        
        int c = (numer1 * denom2) + (numer2 * denom1);
        int d = denom1 * denom2;
        int e = GCD(c, d);
        answer[0] = c / e;
        answer[1] = d / e;
        return answer;
    }
    public static int GCD(int a, int b){
        int r = a % b;
        if(r == 0){
            return b;
        } else {
            return GCD(b, r);
        }
    }    
}