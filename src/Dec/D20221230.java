package Dec;

import java.util.HashMap;
import java.util.Map;

public class D20221230 {
    public static void main(String[] args) {
        D20221230 D = new D20221230();
        int[] array = {1};
        System.out.print(D.solution(array));

    }
    public int solution(int[] array) { // +11
        int answer = 0;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for(int x : array){
            map.put(x,map.getOrDefault(x,0)+1);
        }

        int max = -1;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(max<entry.getValue()){
                max = entry.getValue();
                answer = entry.getKey();
            } else if (max==entry.getValue()){
                answer = -1;
            }
        }

        return answer;
    }

}