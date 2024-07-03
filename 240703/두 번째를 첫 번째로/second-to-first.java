import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char[] arr = a.toCharArray();
        char aa = arr[1];

        for (int i = 0; i < a.length(); i++) {
            if (arr[i] == aa)
            arr[i] = arr[0];
        }
        System.out.print(arr);
        
    }
}