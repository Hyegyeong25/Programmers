package Jan;

public class D20230105_2 {
    public static void main(String[] args) {
        D20230105_2 D = new D20230105_2();
        System.out.print(D.solution("hello", 3));

    }
    public String solution(String my_string, int n) {
        String answer = "";
        for (int i = 0; i < my_string.length(); i++) {
            for (int j = 0; j < n; j++) {
                answer+=my_string.charAt(i);
            }
        }
        return answer;
    }
}