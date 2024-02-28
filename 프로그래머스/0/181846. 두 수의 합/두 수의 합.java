class Solution {
    public String solution(String a, String b) {
        String result = "";
        String temp = "";
        if(a.length() < b.length()) {
            for(int i = 0; i < b.length() - a.length(); i++)
                temp += "0";
            a = temp + a;
        } else if(a.length() > b.length()) {
            for(int i = 0; i < a.length() - b.length(); i++)
                temp += "0";
            b = temp + b;
        }
        
        int ten = 0;
        for(int i = a.length() - 1; i >= 0; i--) {
            int sum = ten + Integer.parseInt(a.charAt(i) + "") + Integer.parseInt(b.charAt(i) + "");
            ten = 0;
            if(i != 0)
                if(sum >= 10) {
                    ten = 1;
                    sum %= 10;
                }
            result = sum + result;
        }
        return result;
    }
}