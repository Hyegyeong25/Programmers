package Jan;

public class D20230103_2 {
    public static void main(String[] args) {
        D20230103_2 D = new D20230103_2();
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.print(D.solution(numbers));
    }
    public double solution(int[] numbers) {
        double answer = 0;
        for (int i = 0; i < numbers.length; i++) {
            answer+=numbers[i];
        }
        return answer/numbers.length;
    }
}
