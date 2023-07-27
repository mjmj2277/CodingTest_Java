class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int min = Integer.MAX_VALUE;
        int min_idx = 0;
        for(int i = 0; i < array.length; i++){
            if(Math.abs(n - array[i]) < min){
                min = Math.abs(n - array[i]);
                min_idx = i;
            } else if(Math.abs(n - array[i]) == min){
                if(n - array[i] > 0){
                    min_idx = i;                  
                }
            }
        }
        answer = array[min_idx];
        return answer;
    }
}