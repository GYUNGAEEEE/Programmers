import java.util.ArrayList;

class Solution {
    public int solution(String my_string, String is_suffix) {
        ArrayList<String> my_suffix = new ArrayList<String>();
        for(int i = 0; i < my_string.length(); i++) {
            my_suffix.add(my_string.substring(i));
        }
        if(my_suffix.contains(is_suffix))
            return 1;
        else
            return 0;
    }
}