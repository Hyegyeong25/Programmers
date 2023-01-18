package Jan;

public class D20230119 {
    public static void main(String[] args) {
        D20230119 D = new D20230119();
        System.out.print(D.solution("205"));

    }

    public String solution(String rsp) {
        String answer = "";
        for (int i = 0; i < rsp.length(); i++) {
            int a = rsp.charAt(i);
            if(a == '0'){
                answer += "5";
            } else if (a == '2') {
                answer += "0";
            }  else if (a == '5') {
                answer += "2";
            }
        }
        return answer;
    }
}