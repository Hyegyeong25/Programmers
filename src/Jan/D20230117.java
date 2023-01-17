package Jan;

public class D20230117 {
    public static void main(String[] args) {
        D20230117 D = new D20230117();
        System.out.print(D.solution(100));

    }
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            if(n%i==0){
                answer++;
            }
        }
        return answer;
    }

}