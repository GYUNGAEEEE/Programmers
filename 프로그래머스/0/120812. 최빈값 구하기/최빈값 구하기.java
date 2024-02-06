import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        Arrays.sort(array);
        int[] num = new int[array[array.length - 1] + 1];
        for(int i=0;i<array.length;i++){
            num[array[i]]++;
        }
        
        int answer = 0;
        int flag = 0;
        for(int i=0;i<num.length;i++){
            if(i == 0)
                continue;
            if(num[answer] < num[i]){
                flag = 0;
                answer = i;
            }
            else if(num[answer] == num[i]){
                flag = 1;
            }
        }
        if(flag == 1)
            return -1;
        else
            return answer;
    }
}