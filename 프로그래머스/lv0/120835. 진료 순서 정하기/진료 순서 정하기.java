import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = {};
        
        List<Integer> intList = new ArrayList<>();
        for(int i =0; i < emergency.length; i++) {
            intList.add(emergency[i]);
        }
        
        Collections.sort(intList, Collections.reverseOrder());
        Map<Integer,Integer> map = new TreeMap<>();
        
        System.out.println(intList);
        for(int i = 0; i < intList.size(); i++) {
            map.put(intList.get(i), i+1);
        }
        
        List<Integer> answerList = new ArrayList<>();
        
        for(int i = 0 ; i < emergency.length; i++) {
            int number = emergency[i];
            for(Map.Entry<Integer,Integer> entry : map.entrySet()) {
                if(number == entry.getKey()) {
                    answerList.add(entry.getValue());
                }
            }
        }
        
        return answerList.stream().mapToInt(i -> i).toArray();
    }
}