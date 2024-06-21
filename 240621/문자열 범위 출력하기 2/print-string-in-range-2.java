import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int b = sc.nextInt();

        for (int i = 0; i < a.length(); i++) {
            arr[(a.length() - i)] = a.charAt(i);
        }

        for (int i = 1; i <= b; i++) {
            System.out.print(arr[i]);
        }
    }
}