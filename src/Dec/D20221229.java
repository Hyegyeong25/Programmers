package Dec;

public class D20221229 {
    public static void main(String[] args) {
        D20221229 D = new D20221229();
        int[] answer = {1, 2, 3, 4, 5};
        int[] ans = D.solution(answer);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]);
        }

    }
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            answer[i] = numbers[i]*2;
        }
        return answer;
    }

}