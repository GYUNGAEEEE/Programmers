import java.util.*;

class Solution {
    public int solution(String myString, String pat) {
        String newString = "";
        for(int i = 0; i < myString.length(); i++) {
            if(myString.charAt(i) == 'A')
                newString += "B";
            else if(myString.charAt(i) == 'B')
                newString += "A";
        }
        
        List<String> arrayList = new ArrayList<>();
        for(int i = 0; i <= newString.length() - pat.length(); i++)
            arrayList.add(newString.substring(i, i + pat.length()));
        if(arrayList.contains(pat))
            return 1;
        else
            return 0;
        
    }
}