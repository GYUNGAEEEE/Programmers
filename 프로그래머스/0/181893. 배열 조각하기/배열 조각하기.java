import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] query) {
        List<Integer> arrayList = new ArrayList<>();
        for(int i = 0; i < arr.length; i++)
            arrayList.add(arr[i]);
        
        for(int i = 0; i < query.length; i++) {
            int q = query[i];
            int len = arrayList.size();
            if(i % 2 == 0) {
                for(int j = 0; j < len - q - 1; j++)
                    arrayList.remove(q + 1);
            } else {
                for(int j = 0; j < q; j++)
                    arrayList.remove(0);
            }
        }
        
        int[] answer = new int[arrayList.size()];
        int idx = 0;
        for(int temp : arrayList)
            answer[idx++] = temp;
        return answer;
    }
}