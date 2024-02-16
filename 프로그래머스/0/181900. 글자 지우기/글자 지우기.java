import java.util.Arrays;

class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        Arrays.sort(indices);
        int indices_idx = 0;
        for(int i = 0; i < my_string.length(); i++) {
            if(indices_idx < indices.length && i == indices[indices_idx]) {
                indices_idx++;
                continue;
            } else {
                answer += my_string.charAt(i);
            }
        }
        return answer;
    }
}