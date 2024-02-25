import java.util.*;

class Solution {
    public String[] solution(String myString) {
        List<String> arrayList = new ArrayList<>();
        int startIdx = 0;
        for(int i = 0; i < myString.length(); i++) {
            if(myString.charAt(i) == 'x') {
                arrayList.add(myString.substring(startIdx, i));
                startIdx = i + 1;
            } else if(i == myString.length() - 1)
                arrayList.add(myString.substring(startIdx));
        }
        while(arrayList.contains(""))
            arrayList.remove("");
        Collections.sort(arrayList);
        
        String[] answer = new String[arrayList.size()];
        int idx = 0;
        for(String temp : arrayList)
            answer[idx++] = temp;
        return answer;
    }
}