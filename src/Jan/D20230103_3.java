package Jan;

public class D20230103_3 {
    public static void main(String[] args) {
        D20230103_3 D = new D20230103_3();
        System.out.println(D.solution(150000));
    }
    public int solution(int price) { //11
        double sale = 0;
        if (price>499999){
            sale = 0.2;
        } else if(price>299999){
            sale = 0.1;
        }
        else if(price>99999){
            sale = 0.05;
        }
        int answer = (int) (price - (price*sale));
        return answer;
    }
}
