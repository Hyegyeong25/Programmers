package Jan;

public class D20230109 {
    public static void main(String[] args) {
        D20230109 D = new D20230109();
        System.out.print(D.solution(30));

    }
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            if(i%2==0){
                answer+=i;
            }
        }
        return answer;
    }

}