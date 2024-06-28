import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int cntE = 0;
        int cntB = 0;
        
        if (a.contains("ee"))
        cntE++;
        if (a.contains("eb"))
        cntB++;
        
        System.out.print(cntE + " " + cntB);

    }
}