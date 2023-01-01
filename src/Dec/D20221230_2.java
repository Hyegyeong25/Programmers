package Dec;

public class D20221230_2 {
    public static void main(String[] args) {
        D20221230_2 D = new D20221230_2();
        int[] ans = D.solution(15);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]);
        }
    }
    public int[] solution(int n) {
        int[] answer = n%2==0? new int[n/2]: new int[n/2+1];
        int j = 0;
        for(int i=1; i<=n; i+=2, j++){
            answer[j] = i;
        }
        return answer;
    }
}
