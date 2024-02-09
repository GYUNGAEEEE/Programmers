import java.util.ArrayList;

class Solution {
    public int[] solution(int start_num, int end_num) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i = start_num; i <= end_num; i++){
            arr.add(i);
        }
        
        int answer[] = new int[arr.size()];
        int idx = 0;
        for(int temp : arr){
            answer[idx++] = temp;
        }
        return answer;
    }
}