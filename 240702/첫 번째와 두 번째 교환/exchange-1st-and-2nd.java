import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char[] arr = a.toCharArray();
        char[] brr = a.toCharArray();

        char b = a.charAt(0);
        char c = a.charAt(1);

        for (int i = 0; i < a.length(); i++) {
            if (arr[i] == b)
            brr[i] = c;
            if (arr[i] == c)
            brr[i] = b;
        }
        System.out.print(brr);
    }
}