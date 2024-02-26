import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        List<String> arrayList = new ArrayList<>();
        String item = "";
        for(int i = 0; i < myStr.length(); i++) {
            if(myStr.charAt(i) == 'a' || myStr.charAt(i) == 'b' || myStr.charAt(i) == 'c') {
                if(item != "") {
                    arrayList.add(item);
                    item = "";
                }
            } else {
                item += myStr.charAt(i);
                if(i == myStr.length() - 1)
                    arrayList.add(item);
            }
            
        }
        
        if(arrayList.isEmpty())
            return new String[]{ "EMPTY" };
        
        String[] answer = new String[arrayList.size()];
        int idx = 0;
        for(String temp : arrayList)
            answer[idx++] = temp;
        return answer;
    }
}