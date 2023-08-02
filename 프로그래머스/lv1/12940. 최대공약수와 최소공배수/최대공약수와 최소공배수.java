class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];//최대공약수, 최소공배수     
        answer[0] = GCD(n,m);
        answer[1] = (n * m)/GCD(n,m);
        return answer;
    }
    public static int GCD(int c, int d){
        int r = c % d;
        if(r == 0){
            return d;
        }else{
            return GCD(d, r);
        }
        
    }
}