class Solution {
    public int solution(int[] num_list) {
        int sum = 0;
        int pro = 1;
        if(num_list.length >= 11) {
            for(int i = 0; i < num_list.length; i++) {
                sum += num_list[i];
            }
            return sum;
        } else {
            for(int i = 0; i < num_list.length; i++) {
                pro *= num_list[i];
            }
            return pro;
        }
    }
}