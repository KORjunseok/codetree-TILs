import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;

        for (int i = 1; i <= n; i++) {
            temp = (temp / i);
            if (temp <= 1) {
                System.out.print(i);
                break;
            }
            
        }


    }
}