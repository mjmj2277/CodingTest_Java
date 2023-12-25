import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int a = 1;
        while(arr.length > a){
            a *= 2;
        }
       
        return Arrays.copyOf(arr, a);
    }
}