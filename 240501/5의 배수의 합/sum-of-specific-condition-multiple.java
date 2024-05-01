import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        int sum = 0;
        int H = Math.max(a, b);
        int L = Math.min(a, b);

        for (int i = L; i <= H; i++) {
            if (i % 5 == 0) 
            sum += i;
        }
        System.out.print(sum);

    }
}