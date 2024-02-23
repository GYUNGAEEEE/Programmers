class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length * k];
        int idx = 0;
        for(int i = 0; i < picture.length; i++) {
            String temp = "";
            for(int j = 0; j < picture[i].length(); j++) {
                for(int l = 0; l < k ; l++)
                    temp += picture[i].charAt(j);
            }
            for(int m = 0; m < k; m++)
                answer[idx++] = temp;
        }
        return answer;
    }
}