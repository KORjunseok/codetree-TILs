import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        String a = "";

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            a += arr[i];
        }
        // System.out.print(a);
        for (int i = 0; i < a.length(); i += 5) {
            System.out.println(a.substring(i, Math.min(i+5, a.length())));
        }
    }
}