import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= n - i; j++) {
                System.out.print(i + " * " + (j + 1) + " = " + (i * (j + 1)) + " ");
                if (j != (n - i))
                System.out.print("/ ");
            }
            System.out.println();
        }
    
        
    }
}