import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int len = a.length();
        a = a.substring(1, len) + a.substring(0, 1);
        System.out.print(a);
    }
}