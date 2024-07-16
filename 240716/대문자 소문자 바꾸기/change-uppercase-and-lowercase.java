import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char[] arr = new char[a.length()];

        for (int i = 0; i < a.length(); i++) {
            arr[i] = a.charAt(i);
            if (arr[i] == Character.toLowerCase(arr[i]))
            arr[i] = Character.toUpperCase(arr[i]);
            else if (arr[i] == Character.toUpperCase(arr[i]))
            arr[i] = Character.toLowerCase(arr[i]);
        }

        System.out.print(arr);

    }
}