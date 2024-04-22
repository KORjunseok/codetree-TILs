import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if (0 > a) {
            System.out.print("ice");
        } else if (100 <= a)
            System.out.print("vapor");
        else System.out.print("water");
    
    }
}