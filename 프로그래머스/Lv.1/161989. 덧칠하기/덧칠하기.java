class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 1;
        int s = section[0];
        int e = section[0] + (m - 1);
        
        for (int i : section) {
            if (s <= i && i <= e) {
                continue;
            } else {
                s = i;
                e = i + (m - 1);
                answer++;
            }
        }
        return answer;
    }
}