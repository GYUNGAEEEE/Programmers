import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        List<String> arrayList = new ArrayList<>();
        int startIdx = 0;
        int endIdx = 0;
        for(int i = 0; i < my_string.length(); i++) {
            if(my_string.charAt(i) == ' ') {
                endIdx = i;
                arrayList.add(my_string.substring(startIdx, endIdx));
                startIdx = i + 1;
            }
            
            if(i == my_string.length() - 1)
                arrayList.add(my_string.substring(startIdx));
        }
        
        String[] answer = new String[arrayList.size()];
        int idx = 0;
        for(String temp : arrayList)
            answer[idx++] = temp;
        return answer;
    }
}