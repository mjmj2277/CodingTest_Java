class Solution {
    public int solution(int[] num_list) {
        int answer = 1;
        if(num_list.length >= 11){
            for(int a : num_list){
                answer += a;
            }
            answer = answer -1;
        } else if (num_list.length <= 10 && 2 <= num_list.length){
            for(int b : num_list){
                answer *= b;
            }
        }
        return answer;
    }
}