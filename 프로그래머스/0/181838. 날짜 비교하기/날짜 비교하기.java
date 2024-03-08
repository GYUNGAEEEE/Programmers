class Solution {
    public int solution(int[] date1, int[] date2) {
        String dateStr1 = "" + date1[0] + date1[1] + date1[2];
        String dateStr2 = "" + date2[0] + date2[1] + date2[2];
        if(Integer.parseInt(dateStr1) < Integer.parseInt(dateStr2))
            return 1;
        else
            return 0;
    }
}