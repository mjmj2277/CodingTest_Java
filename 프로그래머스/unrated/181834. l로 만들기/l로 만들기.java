class Solution {
    public String solution(String myString) {
        String answer = "";
        String[] arr_i = {"a","b","c","d","e","f","g","h","i","j","k"};
        String[] arr = myString.split("");
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr_i.length; j++){
                if(arr[i].equals(arr_i[j])){
                    arr[i] = "l";
                }   
            }
            answer += arr[i];
        }
        return answer;
    }
}