class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for(int qIdx = 0; qIdx < queries.length; qIdx++) {
            int s = queries[qIdx][0];
            int e = queries[qIdx][1];
            int k = queries[qIdx][2];
            
            for(int i = s; i <= e; i++) {
                if(i % k == 0)
                    arr[i]++;
            }
        }
        return arr;
    }
}