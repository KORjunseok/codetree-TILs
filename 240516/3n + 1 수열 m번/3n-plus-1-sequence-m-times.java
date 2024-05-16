import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;

        for (int i = 1; i <= n; i++) {
            int m = sc.nextInt();
            for (int j = 1; j <= m; j++) {
                while (m != 1) {
                    if (m % 2 == 0) {
                    m /= 2;
                    cnt++;
                    }
                    else {
                    m = (m * 3) + 1;
                    cnt++;
                    }
                }
                System.out.print(cnt);
                cnt = 0;
            }
            System.out.println();
        }
    }
}