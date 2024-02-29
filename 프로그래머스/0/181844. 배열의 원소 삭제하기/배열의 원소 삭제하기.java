import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        List<Integer> answerList = new ArrayList<>();
        for(int i = 0; i < arr.length; i++) {
            int flag = 0;
            for(int j = 0; j < delete_list.length; j++) {
                if(arr[i] == delete_list[j]) {
                    flag = 1;
                    break;
                }
            }
            if(flag == 0)
                answerList.add(arr[i]);
        }
        
        int[] answer = new int[answerList.size()];
        int idx = 0;
        for(int temp : answerList)
            answer[idx++] = temp;
        return answer;
    }
}