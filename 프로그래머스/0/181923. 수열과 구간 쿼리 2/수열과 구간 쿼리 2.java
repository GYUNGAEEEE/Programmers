class Solution {
     public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
         
        for(int qIdx = 0; qIdx < queries.length; qIdx++) {
            int s = queries[qIdx][0];
            int e = queries[qIdx][1];
            int k = queries[qIdx][2];
            
            int min = -1;
            for(int i = s; i <= e; i++) {
                if(arr[i] > k) {
                    if(min == -1 || min > arr[i])
                        min = arr[i];
                }
            }
            answer[qIdx] = min;
        }
        
        return answer;
    }
}