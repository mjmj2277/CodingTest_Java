
class Solution {
    boolean solution(String s) {
        boolean answer = true;
        String a = s.toLowerCase();
        String[] b = a.split("");
        int cnt1 = 0;
        int cnt2 = 0;
        for(int i = 0; i < b.length; i++){
            if(b[i].equals("p")){
                cnt1++;
            }else if(b[i].equals("y")){
                cnt2++;
            }
        }
        if(cnt1 == cnt2){
            answer = true;
        }else{
            answer = false;
        }

        return answer;
    }
}