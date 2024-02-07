class Solution {
    public int solution(int[] num_list) {
        int pro = 1;
        int sum = 0;
        for(int i = 0; i < num_list.length; i++){
            pro *= num_list[i];
            sum += num_list[i];
        }
        if(pro < Math.pow(sum, 2))
            return 1;
        else
            return 0;

    }
}