package Feb;

public class D20230202 {
    public static void main(String[] args) {
        D20230202 D = new D20230202();
        int[] arr = {1, 1, 2, 3, 4, 5};
        System.out.print(D.solution(arr, 1));

    }
    public int solution(int[] array, int n) {
        int answer = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]==n) answer++;
        }
        return answer;
    }

}