import java.util.ArrayList;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        for(int i = 0; i < intStrs.length; i++) {
            String subIntStr = intStrs[i].substring(s, s + l);
            int subIntNum = Integer.parseInt(subIntStr);
            if(subIntNum > k)
                result.add(subIntNum);
        }
        int[] answer = new int[result.size()];
        int idx = 0;
        for(int temp : result) {
            answer[idx++] = temp;
        }
        return answer;
    }
}