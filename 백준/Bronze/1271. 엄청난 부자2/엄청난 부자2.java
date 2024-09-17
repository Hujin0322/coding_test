import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        BigInteger a = sc.nextBigInteger();
        BigInteger b = sc.nextBigInteger();
        
        BigInteger[] result = a.divideAndRemainder(b);

        System.out.println(result[0]);
        System.out.println(result[1]);
    }
}