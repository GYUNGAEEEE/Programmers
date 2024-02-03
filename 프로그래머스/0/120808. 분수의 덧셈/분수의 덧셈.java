class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        int numer3 = numer1*denom2 + numer2*denom1;
        int denom3 = denom1*denom2;
        
        int temp = 0;
        if(numer3>denom3)
            temp = denom3;
        else
            temp = numer3;
        while((numer3%temp!=0)||(denom3%temp!=0)){
            temp--;
        }
        answer[0] = numer3/temp;
        answer[1] = denom3/temp;
        
        return answer;
    }
}