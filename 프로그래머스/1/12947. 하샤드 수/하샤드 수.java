class Solution {
    public boolean solution(int x) {
        boolean answer = false;
        String a = "" + x;
        int ab = 0;
        String[] xarr = a.split("");
        for(String b : xarr){
            ab += Integer.parseInt(b);
        }
        if(x % ab  == 0){
            answer = true;
        }
        return answer;
    }
}