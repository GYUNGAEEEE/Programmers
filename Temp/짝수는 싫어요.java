class Solution {
    public int[] solution(int n) {
        int arrSize = 0;
        if(n % 2 == 0)
            arrSize = n / 2;
        else
            arrSize = n / 2 + 1;
        int[] answer = new int[arrSize];
        for(int i=0;i<arrSize;i++)
            answer[i] = i * 2 + 1;
        return answer;
    }
}
