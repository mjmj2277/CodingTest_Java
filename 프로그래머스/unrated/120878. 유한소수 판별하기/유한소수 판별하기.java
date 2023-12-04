class Solution {
    public int solution(int a, int b) {
        int c = b / GCD(a, b);
        
        while(c != 1) {
            if(c % 2 == 0) {
                c /= 2;
            } else if(c % 5 == 0) {
                c /= 5;
            } else {
                return 2;
            }
        }
        
        return 1;
    }
        
    private int GCD(int a, int b) {
        if(b == 0) {
            return a;
        } else {
            return GCD(b, a % b);
        }     
    }
}