package Jan;

public class D20230102 {
    public static void main(String[] args) {
        D20230102 D = new D20230102();
        System.out.print(D.solution(10));

    }
    public int solution(int n) { // 3
        int answer = (n/7) + ((n%7 > 0)?1:0);
        return answer;
    }

}