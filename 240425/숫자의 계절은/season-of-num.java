import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();

        if (3 <= m && 5 >= m) System.out.print("Spring");
        else if (6 <= m && 8 >= m) System.out.print("Summer");
        else if (9 <= m && 11 >= m) System.out.print("Fall");
        else System.out.print("Winter");
    }
}