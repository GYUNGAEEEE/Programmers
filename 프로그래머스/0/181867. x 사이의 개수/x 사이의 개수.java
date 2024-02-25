import java.util.*;

class Solution {
    public int[] solution(String myString) {
        List<Integer> arrayList = new ArrayList<>();
        int cnt = 0;
        for(int i = 0; i < myString.length(); i++) {
            if(i == myString.length() - 1) {
                if(myString.charAt(i) == 'x') {
                    arrayList.add(cnt);
                    arrayList.add(0);
                } else
                    arrayList.add(++cnt);
                break;
            }
            
            if(myString.charAt(i) == 'x') {
                arrayList.add(cnt);
                cnt = 0;
                continue;
            }
            
            cnt++;
        }
        
        int[] answer = new int[arrayList.size()];
        int idx = 0;
        for(int temp : arrayList)
            answer[idx++] = temp;
        return answer;
    }
}