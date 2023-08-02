class Solution {
    public String solution(String bin1, String bin2) {
        String answer = "";
        // String[] b1 = bin1.split("");
        // String[] b2 = bin2.split("");
        // int a1 = 0;
        // int a2 = 0;
        // for(int i = 0; i < b1.length; i++){
        //     a1 += Math.pow(2,i) * Integer.parseInt(b1[b1.length-1-i]);
        // }
        // for(int i = 0; i < b2.length; i++){
        //     a2 += Math.pow(2,i) * Integer.parseInt(b2[b2.length-1-i]);
        // }
        // int a12 = a1 + a2;        
        // while(true){
        //     answer = a12 % 2 + answer;
        //     if(a12 / 2 == 0) break;
        //     a12 = a12 / 2;
        // }
        
        int a = Integer.parseInt(bin1, 2);
        int b = Integer.parseInt(bin2, 2);
        int sum = a+b;
        
        answer = Integer.toString(sum, 2);
        
        
        return answer;
    }
}