import java.util.*;
class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        
        for(int i = 0; i < attendance.length; i++){
            if(attendance[i]){
                list1.add(rank[i]);
            }
            list2.add(rank[i]); //3725461
        }//7254
        Collections.sort(list1);//2457
        System.out.print(list1);
        answer = list2.indexOf(list1.get(0)) * 10000 + list2.indexOf(list1.get(1)) * 100 + list2.indexOf(list1.get(2));
        
        return answer;
    }
}