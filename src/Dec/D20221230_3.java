package Dec;

public class D20221230_3 {
    public static void main(String[] args) {
        int answer = 1;
        int pizza = 1;
        System.out.println(pizza);
        while(pizza>7){
            pizza%=7;
            answer++;
        }
        System.out.println(answer);
    }
}
