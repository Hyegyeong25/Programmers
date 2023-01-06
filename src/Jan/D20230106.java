package Jan;

public class D20230106 {
    public static void main(String[] args) {
        D20230106 D = new D20230106();
        System.out.print(D.solution("javachocochip", "c"));

    }

    public String solution(String my_string, String letter) {
        String answer = my_string.replaceAll(letter,"");
        return answer;
    }
}