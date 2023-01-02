package Jan;

public class D20230101 {
    public static void main(String[] args) {
        D20230101 D = new D20230101();
        System.out.print(D.solution(4));

    }
    public int solution(int n) { // 3
        int gcd = 1;
        int i = (6<n)?6:n;

        for (i = i; i > 1; i--) {
            if (6 % i == 0 && n % i == 0) {
                gcd = i;
                break;
            }
        }

        int answer = 6*n/gcd;
        return answer/6;
    }

}