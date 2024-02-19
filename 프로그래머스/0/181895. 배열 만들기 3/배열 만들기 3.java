class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int[] subarr1 = new int[intervals[0][1] - intervals[0][0] + 1];
        int[] subarr2 = new int[intervals[1][1] - intervals[1][0] + 1];
        System.arraycopy(arr, intervals[0][0], subarr1, 0, subarr1.length);
        System.arraycopy(arr, intervals[1][0], subarr2, 0, subarr2.length);
        
        int[] answer = new int[subarr1.length + subarr2.length];
        System.arraycopy(subarr1, 0, answer, 0, subarr1.length);
        System.arraycopy(subarr2, 0, answer, subarr1.length, subarr2.length);
        
        return answer;
    }
}