import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int len = a.length();

        System.out.println(a);
        for (int i = 0; i < len; i++) {
        a = a.substring(a.length() - 1) + a.substring(0, a.length() - 1);
            System.out.println(a);
        }

    }
}