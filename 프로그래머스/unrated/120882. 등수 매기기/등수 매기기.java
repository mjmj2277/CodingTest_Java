class Solution {
    public int[] solution(int[][] score) {
        int[] total = new int[score.length];
        int[] answer = new int[score.length];
        for(int i = 0; i < score.length; i++) {
            total[i] = score[i][0] + score[i][1]; 
        }
        
        for(int i = 0; i < total.length; i++) {
            int rank = 1;
            for(int j = 0; j < total.length; j++) {
                if(total[i] < total[j]) {
                    rank++;
                }
            }
            answer[i] = rank;
        }
        
        return answer;
    }
}