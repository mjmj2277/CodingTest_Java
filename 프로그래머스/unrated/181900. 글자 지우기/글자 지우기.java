class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        String[] a = my_string.split("");
        for(int i = 0; i < indices.length; i++){
            a[indices[i]] = "";
        }
        for(String b : a){
            if(!b.equals("")){
                answer += b;
            }
        }
        return answer;
    }
}