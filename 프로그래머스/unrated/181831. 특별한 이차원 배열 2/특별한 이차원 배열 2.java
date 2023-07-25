class Solution {
    public int solution(int[][] arr) {
        int answer = 0;
        int check_idx = 0;
        outerLoop:
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
              if(arr[i][j] == arr[j][i]){
                  answer = 1;
              } else {
                   answer = 0;
                  // check_idx = 1;
                  break outerLoop;
                  //return 0;
              }                
            }
            //if(check_idx == 1) break;
        }
        return answer;
    }
}