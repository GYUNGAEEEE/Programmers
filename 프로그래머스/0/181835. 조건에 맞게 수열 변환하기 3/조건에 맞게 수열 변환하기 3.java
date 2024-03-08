class Solution {
    public int[] solution(int[] arr, int k) {
        int mode = 0;
        if(k % 2 == 1)
            mode = 1;
        
        for(int i = 0; i < arr.length; i++) {
            if(mode == 0)
                arr[i] += k;
            else
                arr[i] *= k;
        }
        return arr;
    }
}