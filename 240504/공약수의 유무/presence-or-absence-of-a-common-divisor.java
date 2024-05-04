import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        boolean satisfied = false;

        int temp1 = 1920;
        int temp2 = 2880;

        for (int i = a; i <= b; i++) {
            if (temp1 % i == 0 && temp2 % i == 0) 
            satisfied = true;
        }
        if (satisfied == true)
        System.out.print(1);
        else if (satisfied == false)
        System.out.print(0);
        

    }
}