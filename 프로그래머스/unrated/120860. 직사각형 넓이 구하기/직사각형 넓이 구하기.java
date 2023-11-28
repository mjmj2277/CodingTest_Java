class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        int x = dots[0][0];
        int y = dots[0][1];
        int a = 0;
        int b = 0;
        
        for(int i = 0; i < 4; i++) {
            if( x == dots[i][0] ) {
                a = Math.abs(dots[i][1] - y);
            }
            if ( y == dots[i][1] ) {
                b = Math.abs(dots[i][0] - x);
            }           
        }
        answer = a * b;     
        
        return answer;
    }
}