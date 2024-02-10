class Solution {
    public int solution(int a, int b, int c, int d) {
        int[] diceNum = new int[6];
        diceNum[a - 1]++;
        diceNum[b - 1]++;
        diceNum[c - 1]++;
        diceNum[d - 1]++;
        
        int p = 0, q = 0, r = 0, s = 0;
        for(int i = 0; i < diceNum.length; i++) {
            if(diceNum[i] >= 2 && p == 0) {
                p = i + 1;
            } else if(diceNum[i] >= 1 && q == 0) {
                q = i + 1;
            } else if(diceNum[i] != 0 && r == 0) { 
                r = i + 1;
            } else if(diceNum[i] != 0 && s == 0) {
                s = i + 1;
            } else if(diceNum[i] != 0 && p == 0) {
                p = i + 1;
            }
        }

        if(diceNum[p - 1] == 4)
            return 1111 * p;
        else if(diceNum[p - 1] == 3)
            return (int)Math.pow(10 * p + q, 2);
        else if(diceNum[q - 1] == 2)
            return (p + q) * Math.abs(p - q);
        else if(diceNum[p - 1] == 2)
            return q * r;
        else
            for(int i = 0; i < diceNum.length; i++) {
                if(diceNum[i] != 0)
                    return i + 1;
            }
        
        return 0;
    }
}