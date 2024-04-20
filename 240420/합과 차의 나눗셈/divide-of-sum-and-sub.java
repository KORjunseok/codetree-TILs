import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        double aa = a+b;
        double bb = a-b;

        System.out.printf("%.2f", (aa)/(bb));
    
    }
}