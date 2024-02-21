class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        int size = 0;
        for(int i = 0; i < finished.length; i++) {
            if(finished[i] == false)
                size++;
        }
        String[] answer = new String[size];
        
        for(int i = 0, j = 0; i < todo_list.length; i++) {
            if(finished[i] == false)
                answer[j++] = todo_list[i];
        }
        return answer;
    }
}