import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char[] arr = a.toCharArray();
        
        arr[1] = 'a';
        arr[a.length() - 2] = 'a';

        System.out.print(arr);
    }
}