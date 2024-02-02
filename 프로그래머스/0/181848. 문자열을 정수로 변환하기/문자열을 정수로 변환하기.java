class Solution {
    public int solution(String n_str) {
        int answer = 0;
        int temp = 0;
        
        for(int i=0;i<n_str.length();i++){
            temp = n_str.charAt(i)-48;
            answer += (temp*Math.pow(10, n_str.length()-i-1));
        }
        return answer;
    }
}