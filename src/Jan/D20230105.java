package Jan;

public class D20230105 {
    public static void main(String[] args) {
        D20230105 D = new D20230105();
        int[] num_list = {1, 2, 3, 4, 5};
        for (int i = 0; i < 2; i++) {
            System.out.print(D.solution(num_list)[i]);
        }
    }

    public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        for (int i = 0; i < num_list.length; i++) {
            if(num_list[i]%2==1){
                answer[1]++;
            } else {
                answer[0]++;
            }
        }
        return answer;
    }

}