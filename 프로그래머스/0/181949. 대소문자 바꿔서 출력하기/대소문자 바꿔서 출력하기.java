import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        String b = "";
        char temp = ' ';
        for(int i=0;i<a.length();i++){
            temp = a.charAt(i);
            if((temp>=65)&&(temp<=90)){
                temp += 32;
            }
            else if((temp>=97)&&(temp<=122)){
                temp -= 32;
            }
            b += temp;
        }
        System.out.println(b);
    }
}