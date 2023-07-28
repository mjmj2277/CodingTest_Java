class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        
        boolean answer = (x1 || x2) && (x3 || x4);
        
        return answer;
        // or - true가 하나라도 있으면 true / and - false가 하나라도 있으면 false
    }
}