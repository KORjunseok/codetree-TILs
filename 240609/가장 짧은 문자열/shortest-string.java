import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int htemp = 0;
        int rtemp = 100;

        for (int i = 0; i < 3; i++) {
            String a = sc.next();
            int ai = a.length();
            
            if (ai > htemp)
            htemp = ai;
            if (ai < rtemp)
            rtemp = ai;
        } 
        System.out.print(htemp - rtemp);
    }
}