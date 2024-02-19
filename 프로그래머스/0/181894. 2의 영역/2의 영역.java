class Solution {
    public int[] solution(int[] arr) {
        int startIdx = -1;
        int endIdx = -1;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 2) {
                if(startIdx == -1)
                    startIdx = i;
                endIdx = i;
            }
        }
        
        int[] answer = null;
        if(startIdx == -1) {
            answer = new int[]{-1};
        } else if(endIdx == -1) {
            answer = new int[]{arr[startIdx]};
        } else {
            answer = new int[endIdx - startIdx + 1];
            System.arraycopy(arr, startIdx, answer, 0, answer.length);
        }
        
        return answer;
    }
}