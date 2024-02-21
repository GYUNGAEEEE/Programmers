class Solution {
    public int solution(String myString, String pat) {
        myString = myString.toUpperCase();
        pat = pat.toUpperCase();
        
        if(myString.length() < pat.length())
            return 0;
        else {
            for(int i = 0; i <= myString.length() - pat.length(); i++) {
                if(myString.charAt(i) == pat.charAt(0)) {
                    String temp = myString.substring(i, i + pat.length());
                    if(temp.equals(pat))
                        return 1;
                }
            }
        }
        
        return 0;
    }
}