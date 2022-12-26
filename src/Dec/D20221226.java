package Dec;

public class D20221226 {
    public static void main(String[] args) {
        D20221226 D = new D20221226();
        System.out.print(D.solution("hello", "hello"));

    }
    public int solution(String A, String B) {
        int len = A.length();
        if (B.equals(A)) return 0;
        for (int j = 0; j < len; j++) {
            String str = String.valueOf(A.charAt(len-1));
            for (int i = 1; i < len; i++) {
                str += A.charAt(i-1);
            }
            if(B.equals(str)){
                return j+1;
            } else {
                A = str;
                str = "";
            }
        }
        return -1;
    }

}