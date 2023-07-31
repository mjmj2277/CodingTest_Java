class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        char[] arr = my_string.toCharArray();
        for(int i = 0; i < arr.length; i++){
            if(Character.isUpperCase(arr[i])){
                int idx = (int)arr[i] - (int)'A';
                answer[idx]++;
            } else {
                int idx2 = (int)arr[i] - (int)'a' + 26;
                answer[idx2] += 1;
            }
            
        }
        return answer;
    }
}