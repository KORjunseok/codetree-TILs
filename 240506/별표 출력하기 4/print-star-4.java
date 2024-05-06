import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; n >= i; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print('*' + " ");
            } 
            System.out.println();
        }

        for (int i = 2; n >= i; i++) {
            for (int j = 2; j <= i + 1; j++) {
                System.out.print("* " );
            }
            System.out.println();
        }
    }
}