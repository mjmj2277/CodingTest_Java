class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        String kk = String.valueOf(k);
        String[] a = String.valueOf(num).replaceAll(kk,"a").split("");
        for(int i = 0; i < a.length; i++){
            if(a[i].contains("a")){
                answer = i + 1;
                break;
            } else {
                answer = -1;
            }
        }
        return answer;
    }
}