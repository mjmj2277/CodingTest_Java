class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int mid = total / num;
        if(num %  2 == 1){           
            int start = mid - num / 2;
            for(int i = 0; i < num; i++){
                answer[i] = start;
                start++;
            }
        } else {           
            int start = mid  - (num / 2 - 1);
            for(int i = 0; i < num; i++){
                answer[i] = start;
                start++;
            }
        }
        return answer;
    }
}