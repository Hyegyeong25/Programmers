package Jan;

public class D20230111 {
    public static void main(String[] args) {
        D20230111 D = new D20230111();
        System.out.print(D.solution(70));

    }
    public int solution(int angle) {
        int answer = 0;
        if(angle < 90){
            answer = 1;
        } else if(angle == 90) {
            answer = 2;
        }else if(angle<180){
            answer = 3;
        } else if(angle == 180){
            answer = 4;
        }
        return answer;
    }

}