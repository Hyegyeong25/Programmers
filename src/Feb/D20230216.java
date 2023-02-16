package Feb;

public class D20230216 {
    public static void main(String[] args) {
        D20230216 D = new D20230216();
        int[] arr = {1, 2, 3, 4};
        System.out.print(D.solution(arr, 2));

    }
    public int solution(int[] numbers, int k) {
        int answer = numbers[2*(k-1) % numbers.length];
        return answer;
    }

}