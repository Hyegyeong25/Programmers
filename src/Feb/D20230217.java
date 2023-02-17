package Feb;

public class D20230217 {
    public static void main(String[] args) {
        D20230217 D = new D20230217();

        int[] arr = {1, 8, 2};
        int[] answer = D.solution(arr);

        for (int i = 0; i < 2; i++) {
            System.out.print(answer[i]);
        }
    }
    public int[] solution(int[] array) {
        int[] answer = new int [2];

        int max = 0;
        int index = 0;
        for(int i =0; i<array.length; i++) {
            if( max < array[i]) {
                max = array[i];
                index = i;
            }
        }
        answer[0] = max;
        answer[1] = index;


        return answer;
    }

}