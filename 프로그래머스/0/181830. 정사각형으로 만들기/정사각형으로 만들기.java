class Solution {
    public int[][] solution(int[][] arr) {
        int rowSize = arr.length;
        int columnSize = arr[0].length;
        int[][] answer = null;
        if(rowSize < columnSize)
            answer = new int[columnSize][columnSize];
        else
            answer = new int[rowSize][rowSize];
        
        for(int i = 0; i < rowSize; i++) {
            for(int j = 0; j < columnSize; j++) {
                answer[i][j] = arr[i][j];
            }
        }
        return answer;
    }
}