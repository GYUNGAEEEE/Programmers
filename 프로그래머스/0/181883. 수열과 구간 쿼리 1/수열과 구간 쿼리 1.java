class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for(int idx = 0; idx < queries.length; idx++) {
            int s = queries[idx][0];
            int e = queries[idx][1];
        
            for(int i = s; i <= e; i++) {
                arr[i]++;
            }
        }
        return arr;
    }
}