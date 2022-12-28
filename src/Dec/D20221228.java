package Dec;

public class D20221228 {
    public static void main(String[] args) {
        D20221228 D = new D20221228();
        int[] answer = D.solution(9,2,1,3);
        for (int i = 0; i < answer.length; i++) {
            System.out.println(answer[i]);
        }
    }
    public int[] solution(int denum1, int num1, int denum2, int num2) {
        /*두 분수를 더한 값을 기약 분수로 나타냈을 때 분자와 분모를 순서대로 담은 배열을 return*/
        // 통분
        int a = num1 * num2;
        int b = denum1 * num2 + denum2 * num1;

        // 약분 - 최대 공약수를 구하여 그 수로 나눔
        int gcd = 1;
        int i = (a<b)?a:b;

        for (i = i; i > 1; i--) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
                break;
            }
        }
        a/=gcd;
        b/=gcd;
        int[] answer = {b, a};
        return answer;
    }

}