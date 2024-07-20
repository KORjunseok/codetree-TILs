import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char[] arr = new char[a.length()];
        int b = 0;

        for (int i = 0; i < a.length(); i++) {
            arr[i] = a.charAt(i);
            b += arr[i] - '0';
        }    
        System.out.print(b);

    }
}