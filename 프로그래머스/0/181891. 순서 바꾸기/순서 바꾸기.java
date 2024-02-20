class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] pre_list = new int[n];
        int[] post_list = new int[num_list.length - n];
        System.arraycopy(num_list, 0, pre_list, 0, pre_list.length);
        System.arraycopy(num_list, n, post_list, 0, post_list.length);
        
        int[] answer = new int[num_list.length];
        System.arraycopy(post_list, 0, answer, 0, post_list.length);
        System.arraycopy(pre_list, 0, answer, post_list.length, pre_list.length);
        
        return answer;
    }
}