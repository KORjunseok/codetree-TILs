import java.util.Scanner; 

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int cnt = 0;

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                if (j % 2 == 0)
                // System.out.print((i + j) + " ");
                System.out.print(cnt + " ");
                else
                System.out.print((a * j * 2) - (i + 1) + " ");
            }
            cnt++;
            System.out.println();
        }

    }
}