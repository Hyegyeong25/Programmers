package Jan;

public class D20230103 {
    public static void main(String[] args) {
        D20230103 D = new D20230103();
        System.out.print(D.solution(7, 10));

    }
    public int solution(int slice, int n) {
        return (n%slice>0)? n/slice+1 : n/slice;
    }

}