import java.util.*;

class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        List<Integer> arrayList = new ArrayList<>();
        int a = slicer[0];
        int b = slicer[1];
        int c = slicer[2];
        int startIdx = 0;
        int endIdx = 0;
        int interval = 1;
        switch(n) {
            case 1:
                startIdx = 0;
                endIdx = b;
                break;
            case 2:
                startIdx = a;
                endIdx = num_list.length - 1;
                break;
            case 3:
                startIdx = a;
                endIdx = b;
                break;
            case 4:
                startIdx = a;
                endIdx = b;
                interval = 2;
                break;
        }
        
        for(int i = startIdx; i <= endIdx; i += interval) {
            arrayList.add(num_list[i]);
        }
        
        int[] answer = new int[arrayList.size()];
        int idx = 0;
        for(int temp : arrayList)
            answer[idx++] = temp;
        return answer;
    }
}