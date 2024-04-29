import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        // BigDecimal res = BigDecimal.valueOf(a).divide(BigDecimal.valueOf(b), 21, BigDecimal.ROUND_HALF_UP);

        BigDecimal numerator = new BigDecimal(a);
        BigDecimal denominator = new BigDecimal(b);

        // Perform the division with 21 decimal places precision and rounding
        BigDecimal res = numerator.divide(denominator, 21, RoundingMode.HALF_UP);
        System.out.printf("%.20f", res);

    }
}