import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        int ia = a.length();
        int ib = b.length();

        if (ia == ib)
        System.out.print("same");
        else if (ia > ib)
        System.out.print(a + " " + ia);
        else
        System.out.print(b + " " + ib);

    }
}