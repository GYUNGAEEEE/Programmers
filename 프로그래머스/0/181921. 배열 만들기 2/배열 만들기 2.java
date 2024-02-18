import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int l, int r) {
        List<Integer> arrayList = new ArrayList<Integer>();
        
        for(int i = l; i <= r; i++) {
            int temp = i;
            int checkNum = 0;
            while(true) {
                checkNum = temp % 10;
                temp /= 10;
                
                if(checkNum != 0 && checkNum != 5)
                    break;
                
                if(temp == 0) {
                        arrayList.add(i);
                        break;
                }
            }
        }
        
        int[] answer = new int[arrayList.size()];
        int idx = 0;
        for(int num : arrayList)
            answer[idx++] = num;
        
        if(answer.length == 0)
            return new int[]{-1};
        else
            return answer;
    }
}