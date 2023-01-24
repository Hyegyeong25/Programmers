package Jan;

public class D20230124 {
    public static void main(String[] args) {
        D20230124 D = new D20230124();
        int[] num_list = {1, 2, 3, 4, 5, 6, 7, 8};
        int n = 2;
        System.out.print(D.solution(num_list, n));

    }

    public int[][] solution(int[] num_list, int n) {

        int length = num_list.length/n;
        int[][] answer = new int[length][n];

        int cnt = 0;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < n; j++) {
                answer[i][j] = num_list[cnt];
                cnt++;
            }
        }

        return answer;
    }
}