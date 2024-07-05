import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        for (int i = 0 ; i < 20; i++) {
            int b = sc.nextInt();
            if (b > a.length()) {
            System.out.println(a.charAt(0));
            break;
            }
            a = a.substring(0, b) + a.substring(b + 1);
            System.out.println(a);
        }

    }
}