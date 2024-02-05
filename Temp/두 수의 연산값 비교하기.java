class Solution {
    public int solution(int a, int b) {
        int op1 = Integer.parseInt("" + a + b);
        int op2 = 2 * a * b;
        if(op1 >= op2)
            return op1;
        else
            return op2;
    }
}
