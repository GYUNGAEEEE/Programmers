class Solution {
    public String[] solution(String my_string) {
        String[] answer = new String[my_string.length()];
        for(int i = 0; i < my_string.length(); i++) {
            answer[i] = my_string.substring(i);
        }
        for(int i = 0; i < answer.length - 1; i++) {
            for(int j = i + 1; j < answer.length; j++) {
                if(answer[i].compareTo(answer[j]) > 0) {
                    String temp = answer[i];
                    answer[i] = answer[j];
                    answer[j] = temp;
                }
            }
        }
        return answer;
    }
}