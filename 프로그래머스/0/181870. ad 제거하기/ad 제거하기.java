import java.util.*;

class Solution {
    public String[] solution(String[] strArr) {
        List<String> arrayList = new ArrayList<>();
        for(int i = 0; i < strArr.length; i++) {
            if(strArr[i].contains("ad"))
                continue;
            arrayList.add(strArr[i]);
        }
        
        String[] answer = new String[arrayList.size()];
        int idx = 0;
        for(String temp : arrayList)
            answer[idx++] = temp;
        return answer;
    }
}