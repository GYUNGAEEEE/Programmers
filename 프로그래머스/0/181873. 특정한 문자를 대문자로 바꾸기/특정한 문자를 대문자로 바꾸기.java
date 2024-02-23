class Solution {
    public String solution(String my_string, String alp) {
        char char_alp = alp.charAt(0);
        String answer = "";
        for(int i = 0; i < my_string.length(); i++) {
            if(my_string.charAt(i) == char_alp)
                answer += Character.toUpperCase(char_alp);
            else
                answer += my_string.charAt(i);
        }
        return answer;
    }
}