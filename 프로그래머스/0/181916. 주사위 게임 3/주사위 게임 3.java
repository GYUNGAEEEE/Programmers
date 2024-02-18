class Solution {
    public int solution(int a, int b, int c, int d) {
        int[] diceNum = new int[7];
        diceNum[a]++;
        diceNum[b]++;
        diceNum[c]++;
        diceNum[d]++;
        
        int p = 0, q = 0, r = 0, s = 0;
        for(int i = 1; i <= 6; i++) {
            if(diceNum[i] >= 2 && p == 0)
                p = i;
            else if(diceNum[i] >= 1 && q == 0)
                q = i;
            else if(diceNum[i] != 0 && r == 0)
                r = i;
            else if(diceNum[i] != 0 && s == 0)
                s = i;
            else if(diceNum[i] != 0 && p == 0)
                p = i;
        }

        if(diceNum[p] == 4)
            return 1111 * p;
        else if(diceNum[p] == 3)
            return (int)Math.pow(10 * p + q, 2);
        else if(diceNum[q] == 2)
            return (p + q) * Math.abs(p - q);
        else if(diceNum[p] == 2)
            return q * r;
        else
            for(int i = 1; i <= 6; i++) {
                if(diceNum[i] != 0)
                    return i;
            }
        
        return 0;
    }
}