import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        char as = sc.next().charAt(0);

        int b = sc.nextInt();
        char bs = sc.next().charAt(0);

        if ((a >= 19 && as == 'M') || (b >= 19 && bs == 'M')) 
        System.out.print(1);
        else 
        System.out.print(0);
    }
}