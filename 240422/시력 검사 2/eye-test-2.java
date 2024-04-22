import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        
        double a = sc.nextDouble();

        if (1.0 <= a) System.out.print("High");
        else if (0.5 <= a) System.out.print("Middle");
        else System.out.print("Low"); 
    }
}