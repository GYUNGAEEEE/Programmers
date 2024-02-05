class Solution {
    public int solution(int a, int b) {
        int operator1 = Integer.parseInt("" + a + b);
        int operator2 = Integer.parseInt("" + b + a);
        if(operator1 >= operator2)
            return operator1;
        else
            return operator2;
    }
}
