class Solution {
    public String solution(String myString, String pat) {
        StringBuffer sb = new StringBuffer(myString);
        String reverse_myString = sb.reverse().toString();
        sb = new StringBuffer(pat);
        String reverse_pat = sb.reverse().toString();
        
        int idx = 0;
        for(int i = 0; i < reverse_myString.length(); i++) {
            if(reverse_myString.charAt(i) == reverse_pat.charAt(0)) {
                String temp = reverse_myString.substring(i, i + reverse_pat.length());
                if(reverse_pat.equals(temp)) {
                    idx = i;
                    break;
                }
            }
        }

        String answer = reverse_myString.substring(idx);
        sb = new StringBuffer(answer);
        answer = sb.reverse().toString();
        return answer;
    }
}