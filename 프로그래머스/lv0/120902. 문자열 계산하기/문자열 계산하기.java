class Solution {
    public int solution(String my_string) {
        String[] a = my_string.split(" ");
        int answer = Integer.parseInt(a[0]);
        for(int i = 1; i < a.length-1; i++){
            if(a[i].equals("+")){
                answer += Integer.parseInt(a[i+1]);       
            }else if(a[i].equals("-")){
                answer -= Integer.parseInt(a[i+1]);       
            }
        }        
        return answer;
    }
}