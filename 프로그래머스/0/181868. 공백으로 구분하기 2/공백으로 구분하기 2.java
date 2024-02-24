import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        List<String> arrayList = new ArrayList<>();
        do {
            my_string = my_string.trim();
            for(int i = 0; i < my_string.length(); i++) {
                if(i == my_string.length() - 1) {
                    arrayList.add(my_string);
                    my_string = "";
                    break;
                }
                if(my_string.charAt(i) == ' ') {
                    arrayList.add(my_string.substring(0, i));
                    my_string = my_string.substring(i);
                    break;
                }
            }
        } while(my_string.length() != 0);
                              
        String[] answer = new String[arrayList.size()];
        int idx = 0;
        for(String temp : arrayList)
            answer[idx++] = temp;
        return answer;
    }
}