package Jan;

public class D20230112 {
    public static void main(String[] args) {
        D20230112 D = new D20230112();
        int[] numbers = {1, 2, 3, 4, 5};
        int[] solution = D.solution(numbers, 1, 4);
        for (int i = 0; i < solution.length; i++) {
            System.out.println(solution[i]);
        }

    }

    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = new int[num2-num1+1];
        int j = 0;
        for (int i = num1; i <= num2; i++, j++) {
            answer[j] = numbers[i];
        }
        return answer;
    }
}