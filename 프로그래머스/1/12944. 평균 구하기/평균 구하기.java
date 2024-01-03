class Solution {
    public double solution(int[] arr) {
        int sum = 0;
        for(int numbers : arr) {
            sum += numbers;
        }
        
        return (double) sum / arr.length;
    }
}