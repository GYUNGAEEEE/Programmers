import java.util.ArrayList;

class Solution {
    public int[] solution(int l, int r) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i = l; i <= r; i++) {
            int temp = i;
            int checkNum = 0;
            while(true) {
                checkNum = temp % 10;
                temp /= 10;
                if(checkNum != 0 && checkNum != 5)
                    break;
                else{
                    if(temp == 0) {
                        arr.add(i);
                        break;
                    }
                }
            }
        }
        
        int[] answer = new int[arr.size()];
        int idx = 0;
        for(int num : arr){
            answer[idx] = num;
            idx++;
        }
        if(answer.length == 0)
            return new int[]{-1};
        else
            return answer;
    }
}