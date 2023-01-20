package Jan;

public class D20230120 {
    public static void main(String[] args) {
        D20230120 D = new D20230120();
        System.out.print(D.solution(5, 3));

    }
    public int factorial(int fac){
        int answer = 1;
        for (int i = fac; i > 0; i--) {
            answer *= i;
        }
        return answer;
    }
    public int solution(int balls, int share) {
        int answer = factorial(balls) / (factorial(balls-share) * factorial(share));
        return answer;
    }
}