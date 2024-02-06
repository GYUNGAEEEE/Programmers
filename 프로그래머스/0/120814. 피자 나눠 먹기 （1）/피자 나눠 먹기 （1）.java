class Solution {
    public int solution(int n) {
        int answer = 1;
        int pcs = 7;
        while(true){
            if(pcs < n){
                answer++;
                pcs += 7;
            }
            else
                break;
        }
        return answer;
    }
}