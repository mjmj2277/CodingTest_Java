class Solution {
    public int solution(int n, String control) {
        int answer = 0;
        String[] c = control.split("");
        for(int i = 0; i < c.length; i++){
            if (c[i].equals("w")){
                n += 1;                
            } else if (c[i].equals("s")){
                n -= 1;                
            } else if (c[i].equals("d")){
                n += 10;             
            } else {
                n -= 10;              
            }           
        }
        answer = n;        
        return answer;
    }
}