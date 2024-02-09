import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        while(n != 1){
            arr.add(n);
            if(n % 2 == 0)
                n /= 2;
            else
                n = 3 * n + 1;
        }
        arr.add(1);
        
        int[] answer = new int[arr.size()];
        int idx = 0;
        for(int temp : arr)
            answer[idx++] = temp;
        return answer;
    }
}