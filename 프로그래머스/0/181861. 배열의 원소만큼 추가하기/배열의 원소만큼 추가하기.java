import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> arrayList = new ArrayList<>();
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i]; j++) {
                arrayList.add(arr[i]);
            }
        }
        
        int[] answer = new int[arrayList.size()];
        int idx = 0;
        for(int temp : arrayList)
            answer[idx++] = temp;
        return answer;
    }
}