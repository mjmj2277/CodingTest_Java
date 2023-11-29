class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        Long pLong = Long.parseLong(p);
        
        for(int i = 0; i <= t.length() - p.length(); i++) {
            String tmp = t.substring(i, i + p.length());
            Long tmpLong = Long.parseLong(tmp);
            if(tmpLong <= pLong) {
                answer++;
            }
        }
  
        return answer;
    }
}