class Solution {
    public String solution(String my_string, int[][] queries) {
        for(int i = 0; i < queries.length; i++) {
            int s = queries[i][0];
            int e = queries[i][1];
            String substr1 = my_string.substring(0, s);
            String substr2 = my_string.substring(s, e + 1);
            String substr3 = my_string.substring(e + 1);
            
            String temp = "";
            temp += substr1;
            for(int j = substr2.length() - 1; j >= 0; j--) {
                temp += substr2.charAt(j);
            }
            temp += substr3;
            my_string = temp;
        }
        
        return my_string;
    }
}