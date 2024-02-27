class Solution {
    public int solution(String[] strArr) {
        int[] strArrSize = new int[30];
        for(int i = 0; i < strArr.length; i++)
            strArrSize[strArr[i].length() - 1]++;
        
        int answer = 0;
        for(int i = 0; i < strArrSize.length; i++) {
            if(answer < strArrSize[i])
                answer = strArrSize[i];
        }
        return answer;
    }
}