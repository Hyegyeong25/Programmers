package Jan;

public class D20230131 {
    public static void main(String[] args) {
        D20230131 D = new D20230131();
        System.out.print(D.solution(1));

    }
    public int solution(int order) {
        int answer = 0;
        for (int i = 0; i < order; i++) {
            int a = order%10;
            if( a%3 == 0 ) answer++;
            order=order/10;
        }
        return answer;
    }

}