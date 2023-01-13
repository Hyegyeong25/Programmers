package Jan;

public class D20230113 {
    public static void main(String[] args) {
        D20230113 D = new D20230113();
        System.out.print(D.solution(2351));

    }

    public String solution(int age) {
        StringBuilder sb = new StringBuilder();
        String answer = String.valueOf(age);
        for (int i = 0; i < answer.length(); i++) {
            sb.append((char)(Integer.parseInt(String.valueOf(answer.charAt(i)))+97));
        }
        return sb.toString();
    }
}