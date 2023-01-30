package Jan;

import java.util.Arrays;

public class D20230130 {
    public static void main(String[] args) {
        D20230130 D = new D20230130();
        int[] array= {149, 180, 192, 170};
        int height = 190;
        System.out.print(D.solution(array, height));

    }

    public int solution(int[] array, int height) {
        int answer = 0;
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            if(array[i] > height) return array.length-i;
        }
        return answer;
    }

}