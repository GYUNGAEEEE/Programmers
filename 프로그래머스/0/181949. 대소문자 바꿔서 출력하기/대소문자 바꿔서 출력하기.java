import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        
        String answer = "";
        char alphabet = ' ';
        for(int i = 0; i < str.length(); i++){
            alphabet = str.charAt(i);
            if(alphabet >= 'A' && alphabet <= 'Z') //'A': 65, 'Z': 90
                alphabet += 32;
            else if(alphabet >= 'a' && alphabet <= 'z') //'a':97, 'z':122
                alphabet -= 32;
            answer += alphabet;
        }
        
        System.out.println(answer);
    }
}