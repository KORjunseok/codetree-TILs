import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                for (int x = n; x >= i; x--) {
                    System.out.print('*');
                }
                System.out.print(" ");
            }
            System.out.println();
        }

    }
}