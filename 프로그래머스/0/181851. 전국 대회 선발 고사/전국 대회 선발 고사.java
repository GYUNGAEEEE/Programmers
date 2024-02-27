import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int[] original_rank = Arrays.copyOf(rank, rank.length);
        for(int i = 0; i < rank.length - 1; i++) {
            int flag = 0;
            for(int j = 0; j < rank.length - 1 - i; j++) {
                if(rank[j] > rank[j + 1]) {
                    int temp1 = rank[j];
                    rank[j] = rank[j + 1];
                    rank[j + 1] = temp1;
                    
                    boolean temp2 = attendance[j];
                    attendance[j] = attendance[j + 1];
                    attendance[j + 1] = temp2;
                    
                    flag = 1;
                }
            }
            if(flag == 0)
                break;
        }
        
        int a = 0;
        int b = 0;
        int c = 0;
        int cnt = 1;
        for(int i = 0; i < rank.length; i++) {
            if(attendance[i] == true) {
                int original_idx = 0;
                for(int j = 0; j < original_rank.length; j++) {
                    if(rank[i] == original_rank[j]) {
                        original_idx = j;
                        break;
                    }
                }
                
                if(cnt == 1) {
                    a = original_idx;
                    cnt++;
                } else if(cnt == 2) {
                    b = original_idx;
                    cnt++;
                } else if(cnt == 3) {
                    c = original_idx;
                    break;
                }
            }
        }
        return 10000 * a + 100 * b + c;
    }
}