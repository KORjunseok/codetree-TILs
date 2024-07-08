import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);
        char b = sc.next().charAt(0);

        int aa = (int)a;
        int bb = (int)b;
        int cc = 0;

        if (aa > bb)
        cc = aa - bb;
        else 
        cc = bb - aa;

        System.out.print(aa + bb + " " + cc);

    }
}