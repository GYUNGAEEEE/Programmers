import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int num = 1;
        while(true) {
            if(arr.length == 1)
                break;
            if(Math.pow(2, num - 1) < arr.length && arr.length <= Math.pow(2, num))
                break;
            num++;
        }
        if(arr.length == 1)
            return arr;
        else {
            int[] answer = Arrays.copyOf(arr, (int)Math.pow(2, num));
            return answer;
        }
    }
}