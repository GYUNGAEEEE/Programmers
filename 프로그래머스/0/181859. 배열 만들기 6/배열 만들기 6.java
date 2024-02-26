import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> stk = new ArrayList<>();
        for(int i = 0; i < arr.length; i++) {
            if(stk.isEmpty() || stk.get(stk.size() - 1) != arr[i])
                stk.add(arr[i]);
            else
                stk.remove(stk.size() - 1);
        }
        
        if(stk.isEmpty())
            return new int[]{ -1 };
        
        int[] answer = new int[stk.size()];
        int idx = 0;
        for(int temp : stk)
            answer[idx++] = temp;
        return answer;
    }
}