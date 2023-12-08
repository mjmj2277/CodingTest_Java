class Solution {
    public String solution(String[] seoul) {
        int a = 0;        
        for(int i = 0; i < seoul.length; i++){
            if(seoul[i].equals("Kim")){
                a = i;
            }
        }
        return "김서방은 " + a + "에 있다";
    }
}