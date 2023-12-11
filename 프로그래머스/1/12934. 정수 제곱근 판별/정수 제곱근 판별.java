
class Solution {
    public long solution(long n) {
        long answer = 0;        
        double a = Math.sqrt(n);
        if(a - (long)a != 0){
            answer = -1;
        } else {
            long tmp = (long)a;
            answer = (tmp + 1) * (tmp + 1);
        }
        return answer;
    }
}