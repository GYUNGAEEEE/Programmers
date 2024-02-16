class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        for(int i = 0; i < my_string.length(); i++) {
            int my_char = my_string.charAt(i);
            if(Character.isUpperCase(my_char))
                answer[my_char - 65]++;
            else
                answer[my_char - 71]++;
        }
        return answer;
    }
}