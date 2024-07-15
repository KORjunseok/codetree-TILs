import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char[] arr = new char[100];
        String b = "";
        int c = 0;

        for (int i = 0; i < a.length(); i++) {
            arr[i] = a.charAt(i);
            if((arr[i] >= '0') && (arr[i] <= '9'))
            c += arr[i] - '0';
        }
        // b = (float)b;
        // for (int i = 0; i < b.length(); i++) {
        //     c += b.charAt(i);
        // }
        System.out.print(c);
    }
}