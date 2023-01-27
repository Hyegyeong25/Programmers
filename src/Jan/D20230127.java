package Jan;

public class D20230127 {
    public static void main(String[] args) {
        D20230127 D = new D20230127();
        int[] numbers = {4, 455, 6, 4, -1, 45, 6};
        String dir = "left";

        int[] ans = D.solution(numbers, dir);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }

    }
    public int[] solution(int[] numbers, String direction) {
        int len = numbers.length;
        int[] answer = new int[len];
        if(direction.equals("right")){
            answer[0] = numbers[len-1];
            for (int i = 0; i < len-1; i++) {
                answer[i+1] = numbers[i];
            }
        } else {
            answer[len-1] = numbers[0];
            for (int i = 0; i < len-1; i++) {
                answer[i] = numbers[i+1];
            }
        }
        return answer;
    }

}