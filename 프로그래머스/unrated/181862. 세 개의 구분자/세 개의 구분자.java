class Solution {
    public String[] solution(String myStr) {
        String a = myStr.replaceAll("[a,b,c]"," ").trim();
        String[] b = a.split("\\s+");
        if(b[0].equals("")){
            b[0] = "EMPTY";
        }
        
        return b;
    }
}