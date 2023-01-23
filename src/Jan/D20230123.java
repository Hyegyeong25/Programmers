package Jan;

public class D20230123 {
    public static void main(String[] args) {
        D20230123 D = new D20230123();
        int[] dot = {-1, 2};
        System.out.print(D.solution(dot));

    }

    public int solution(int[] dot) {
        int answer = 0;
        if(dot[0]>0 && dot[1]>0){
            answer = 1;
        } else if(dot[0]>0 && dot[1]<0) {
            answer = 4;
        }  else if(dot[0]<0 && dot[1]>0){
            answer = 2;
        } else {
            answer = 3;
        }
        return answer;
    }
}