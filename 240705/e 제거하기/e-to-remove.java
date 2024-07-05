import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char[] arr = a.toCharArray();
        char e = 'e';

        for (int i = 0; i < a.length(); i++) {
            if (arr[i] == e) {
                a = a.substring(0, i) + a.substring(i + 1);
                System.out.print(a);
                break;
            }

        }
    }
}