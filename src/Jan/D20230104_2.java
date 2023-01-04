package Jan;

public class D20230104_2 {
    public static void main(String[] args) {
        D20230104_2 D = new D20230104_2();
        System.out.print(D.solution("jaron"));

    }
    public String solution(String my_string) {
        String answer = "";
        for (int i = my_string.length(); i > 0; i--) {
            answer+=my_string.charAt(i-1);
        }
        return answer;
    }

}