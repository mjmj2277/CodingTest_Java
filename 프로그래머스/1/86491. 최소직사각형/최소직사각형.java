class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int w = 0;
        int l = 0;
        
        for(int i = 0; i < sizes.length; i++) {            
            w = Math.max(Math.max(sizes[i][0], sizes[i][1]), w);
            l = Math.max(Math.min(sizes[i][0], sizes[i][1]), l);
        }
        answer = w * l;
        
        return answer;
    }
}