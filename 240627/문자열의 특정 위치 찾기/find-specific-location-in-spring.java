import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char b = sc.next().charAt(0);

        if (a.indexOf(b) == -1)
        System.out.print("No");
        else
        System.out.print(a.indexOf(b));
    }
}