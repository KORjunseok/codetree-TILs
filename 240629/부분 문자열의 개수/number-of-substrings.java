import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        int cnt = 0 ;

        for (int i = 0; i < a.length() - 1; i++) {
            if (b.charAt(0) == a.charAt(i) && b.charAt(1) == a.charAt(i + 1))
            cnt++;
        }
        System.out.print(cnt);
    }
}