import java.util.*;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        Arrays.sort(lottos);
        Arrays.sort(win_nums);
        int z = (int) Arrays.stream(lottos).filter(num -> num == 0).count();
        int cnt = 0;

        for (int i = z; i < lottos.length; i++) {
            for (int j = 0; j < win_nums.length; j++) {
                if (lottos[i] == win_nums[j]) {
                    cnt++;
                    break;
                }
            }
        }

        answer[0] = Math.min(7 - (cnt + z), 6);
        answer[1] = Math.min(7 - cnt, 6);

        return answer;
    }
}
