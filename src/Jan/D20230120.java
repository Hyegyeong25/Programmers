package Jan;

import java.math.BigInteger;

public class D20230120 {
    public static void main(String[] args) {
        D20230120 D = new D20230120();
        System.out.print(D.solution(30, 20));

    }
    public int factorial(int fac){
        BigInteger bigNumber = new BigInteger("1");
        for (int i = fac; i > 0; i--) {
            //bigNumber = bigNumber * BigInteger.valueOf(i);
        }
        return 0;
    }
    public BigInteger solution(int balls, int share) {
        BigInteger bigNumber = new BigInteger("10000");
        bigNumber = BigInteger.valueOf(factorial(balls) / (factorial(balls-share) * factorial(share)));
        return bigNumber;
    }
}