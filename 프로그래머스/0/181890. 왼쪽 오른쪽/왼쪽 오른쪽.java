class Solution {
    public String[] solution(String[] str_list) {
        String preStr = null;
        int preStrIdx = 0;
        for(int i = 0; i < str_list.length; i++) {
            if(str_list[i].equals("l") || str_list[i].equals("r")) {
                preStr = str_list[i];
                preStrIdx = i;
                break;
            }
        }
        
        if(preStr == null)
            return new String[]{};
        
        String[] answer = null;
        if(preStr.equals("l")) {
            answer = new String[preStrIdx];
            System.arraycopy(str_list, 0, answer, 0, answer.length);
        } else if(preStr.equals("r")) {
            answer = new String[str_list.length - preStrIdx - 1];
            System.arraycopy(str_list, preStrIdx + 1, answer, 0, answer.length);
        }
        return answer;
    }
}