import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int cnt = 0;
        int plus = 0;

        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] == 0)
            break;
            plus += arr[i];
            cnt++;
        }
        System.out.print(plus + " ");
        System.out.printf("%.1f", (double) (plus / cnt));

    }
}