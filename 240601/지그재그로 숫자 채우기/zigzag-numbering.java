import java.util.Scanner; 

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int cnt1 = 0;
        int cnt2 = 0;

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                if (j == 0) {
                System.out.print(i + " ");
                }
                if (j % 2 == 0) {
                System.out.print(cnt1 + " ");
                }
                cnt1++;
            }
            System.out.println();
        }

    }
}