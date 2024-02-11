class Solution {
    public String solution(String str1, String str2) {
        String answer = "";
        
        int answerLen = str1.length() + str2.length();
        for(int i = 0, j = 0; (i + j) < answerLen;) {
            if(answer.length() % 2 == 0)
                answer += str1.charAt(i++);
            else
                answer += str2.charAt(j++);
        }
        
        return answer;
    }
}