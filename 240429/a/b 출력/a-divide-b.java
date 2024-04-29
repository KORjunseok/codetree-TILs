import java.util.Scanner;
import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        BigDecimal res = BigDecimal.valueOf(a).divide(BigDecimal.valueOf(b), 21, BigDecimal.ROUND_HALF_UP);

        System.out.printf("%.20f", res);
    }
}