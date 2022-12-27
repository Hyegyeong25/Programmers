package Dec;

public class D20221227 {
    public static void main(String[] args) {
        D20221227 D = new D20221227();
        System.out.print(D.solution("Happy birthday!"));

    }

    public int solution(String message) {
        int answer = message.length()*2;
        return answer;
    }
}