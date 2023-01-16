package Jan;

import java.util.HashMap;
import java.util.Map;

public class D20230116 {
    public static void main(String[] args) {
        D20230116 D = new D20230116();
        int[] emergency = {3, 76, 24};
        System.out.print(D.solution(emergency));

    }
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = emergency[i];
        }
        // 내림차순 정렬
        for (int i = 0; i < emergency.length; i++) {
            for (int j = i+1; j < emergency.length; j++) {
                if(answer[i]<answer[j]){
                    int tmp = answer[i];
                    answer[i] = answer[j];
                    answer[j] = tmp;
                }
            }
        }
        Map<String, Object> map = new HashMap<>();
        for (int i = 0; i < answer.length; i++){
            map.put(answer[i]+"", i+1);
        }
        int[] ans = new int[emergency.length];
        for (int i = 0; i < emergency.length; i++) {
            ans[i] = (int) map.get(emergency[i]+"");
            System.out.println(ans[i]);
        }
        return ans;
    }

}