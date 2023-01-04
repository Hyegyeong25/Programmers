package Jan;

public class D20230104 {
    public static void main(String[] args) {
        D20230104 D = new D20230104();
        int[] num_list = {1, 2, 3, 4, 5};
        for (int i = 0; i < num_list.length; i++) {
            System.out.println(D.solution(num_list)[i]);
        }

    }
    public int[] solution(int[] num_list) {
        int n = num_list.length;
        int[] answer = new int[n];
        for (int i = 0; i < n; i++) {
            answer[n-i-1] = num_list[i];
        }
        return answer;
    }


}