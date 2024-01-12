class Solution {
    public int solution(int n) {
        int answer = 0;
        boolean[] isPrime = new boolean[n + 1];

        // 모든 숫자를 소수로 초기화
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }

        // 소수가 아닌 숫자 표시
        int root = (int) Math.sqrt(n);
        for (int i = 2; i <= root; i++) {
            if (isPrime[i]) {
                for (int j = i; i * j <= n; j++) {
                    isPrime[i * j] = false;
                }
            }
        }

        // 소수 개수 세기
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                answer++;
            }
        }

        return answer;
    }
}
