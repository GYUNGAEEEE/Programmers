class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length + 1];
        System.arraycopy(num_list, 0, answer, 0, num_list.length);
        
        int lastIdx = num_list.length - 1;
        if(num_list[lastIdx] > num_list[lastIdx - 1])
            answer[lastIdx + 1] = num_list[lastIdx] - num_list[lastIdx - 1];
        else
            answer[lastIdx + 1] = num_list[lastIdx] * 2;
        
        return answer;
    }
}