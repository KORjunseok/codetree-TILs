import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int temp = a;

        for (int i = a; i <= b; i++) {
            while (temp <= b) {
                System.out.print(temp + " ");
            if (temp % 2 == 1) 
            temp *= 2;
            else 
            temp += 3;
            }
            

        }


    }
}