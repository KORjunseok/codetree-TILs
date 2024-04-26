import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        char aC = sc.next().charAt(0); 
        int aN = sc.nextInt();
        char bC = sc.next().charAt(0); 
        int bN = sc.nextInt();
        char cC = sc.next().charAt(0); 
        int cN = sc.nextInt();
        int temp = 0;

        if ((aC == 'Y') && (aN >= 37)) temp += 1;
        if ((bC == 'Y') && (bN >= 37)) temp += 1;
        if ((cC == 'Y') && (cN >= 37)) temp += 1;

        if (temp >= 2) System.out.print('E');
        else System.out.print('N');
        
        temp = 0;
    }
}