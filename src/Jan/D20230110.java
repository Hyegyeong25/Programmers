package Jan;

import java.util.HashMap;
import java.util.Map;

public class D20230110 {
    public static void main(String[] args) {
        D20230110 D = new D20230110();
        String letter = ".--. -.-- - .... --- -.";
        System.out.print(D.solution(letter));

    }
    public String solution(String letter) {
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String[] ch = letter.split(" ");
        String answer = "";
        for (int i = 0; i < ch.length; i++) {
            for (int j = 0; j < morse.length; j++) {
                if(ch[i].equals(morse[j])){
                    answer+=(char)(97+j);
                    break;
                }
            }
        }
        return answer;
    }

}