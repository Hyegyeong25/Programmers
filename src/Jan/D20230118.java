package Jan;

public class D20230118 {
    public static void main(String[] args) {
        D20230118 D = new D20230118();
        System.out.print(D.solution(999));

    }

    public int solution(int hp) {
        int answer = hp/5 + (hp%5)/3 + (hp%5)%3;
        return answer;
    }
}