class Solution {
    public int solution(String my_string, String is_prefix) {
        if(my_string.length() < is_prefix.length())
            return 0;
        
        String prefix = my_string.substring(0, is_prefix.length());
        if(is_prefix.equals(prefix))
            return 1;
        else
            return 0;
    }
}