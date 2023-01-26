package Jan;

public class D20230126 {
    public static void main(String[] args) {
        D20230126 D = new D20230126();
        String[] strlist = {"We", "are", "the", "world!"};
        System.out.print(D.solution(strlist));

    }
    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];
        for (int i = 0; i < strlist.length; i++) {
            answer[i] = strlist[i].length();
        }
        return answer;
    }

}