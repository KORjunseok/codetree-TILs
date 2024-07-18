import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        String aa = "";
        String bb = "";

        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            if ((c >= '0') && (c <= '9'))
            aa += c;
        }        
        for (int i = 0; i < b.length(); i++) {
            char d = b.charAt(i);
            if ((d >= '0') && (d <= '9'))
            bb += d;
        }

        int iaa = Integer.parseInt(aa);
        int ibb = Integer.parseInt(bb);

        System.out.print(iaa + ibb);
    }
}