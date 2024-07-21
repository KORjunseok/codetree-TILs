import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum = 0;

        for (int i = 0; i < a; i++) {
            int b = sc.nextInt();
            sum += b;
        }
        String ssum = Integer.toString(sum);
        char[] bsum = new char[ssum.length()];
        
        for (int i = 1; i < ssum.length(); i++) {
            bsum[i - 1] = ssum.charAt(i);
        }
        bsum[ssum.length() - 1] = ssum.charAt(0);

        // bsum[0] = ssum.charAt(ssum.length() - 1);

        System.out.print(bsum);
        
    }
}