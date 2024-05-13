import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < b / 2; j++) {
                System.out.print(b - (a * j) + " * " + (i + 1) + " = " + (b - (a * j)) * (i + 1));
                if (j != (b / 2) - 1)
                System.out.print(" / ");
            }
            System.out.println();
        }
    }
}