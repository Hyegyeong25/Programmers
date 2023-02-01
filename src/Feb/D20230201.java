package Feb;

public class D20230201 {
    public static void main(String[] args) {
        D20230201 D = new D20230201();
        System.out.print(D.solution(29183, 1));

    }
    public int solution(int num, int k) {
        String snum = String.valueOf(num);
        int answer = snum.indexOf(String.valueOf(k));
        if(answer!= -1) answer++;
        return answer;
    }

}