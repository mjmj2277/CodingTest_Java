import java.util.*;

class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        
        for (int i : ingredient) {
            stack.push(i);

            // 햄버거는 1 2 3 1 순서로 쌓는다
            if (stack.size() >= 4 &&
                stack.get(stack.size() - 1) == 1 &&
                stack.get(stack.size() - 2) == 3 &&
                stack.get(stack.size() - 3) == 2 &&
                stack.get(stack.size() - 4) == 1) {
                
                answer++;
                stack.pop(); // 1
                stack.pop(); // 3
                stack.pop(); // 2
                stack.pop(); // 1
            }
        }

        return answer;
    }
}
