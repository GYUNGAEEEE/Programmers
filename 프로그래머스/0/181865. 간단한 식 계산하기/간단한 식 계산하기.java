class Solution {
    public int solution(String binomial) {
        String a = "";
        String op = "";
        String b = "";
        for(int i = 0; i < binomial.length(); i++) {
            if(binomial.charAt(i) == ' ') {
                a = binomial.substring(0, i);
                op = binomial.substring(i + 1, i + 2);
                b = binomial.substring(i + 3);
                break;
            }
        }
        
        int answer = 0;
        switch(op) {
            case "+":
                answer = Integer.parseInt(a) + Integer.parseInt(b);
                break;
            case "-":
                answer = Integer.parseInt(a) - Integer.parseInt(b);
                break;
            case "*":
                answer = Integer.parseInt(a) * Integer.parseInt(b);
                break;
        }
        return answer;
    }
}