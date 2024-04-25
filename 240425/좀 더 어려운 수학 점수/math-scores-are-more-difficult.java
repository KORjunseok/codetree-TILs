import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int MathA = sc.nextInt();
        int EngilishA = sc.nextInt();
        
        int MathB = sc.nextInt();
        int EngilishB = sc.nextInt();

        if (MathA > MathB) System.out.print("A");
        else if ((MathA >= MathB) && (EngilishA > EngilishB)) System.out.print("A");
        else System.out.print("B");

    }
}