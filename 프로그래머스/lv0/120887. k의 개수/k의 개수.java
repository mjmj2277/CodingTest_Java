class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String b = "";   
        String c = "";
        for(int a = i; a <=j; a++){
            c += String.valueOf(a);
        }
        String[] d = c.split("");
        for(int f = 0; f < d.length; f++){
            if(d[f].contains(String.valueOf(k))){
                answer++;
            }
        }
        
        
        return answer;
    }
}