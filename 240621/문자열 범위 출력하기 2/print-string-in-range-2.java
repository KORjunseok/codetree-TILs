import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String str;
        
        str = sc.next();

        int a = sc.nextInt();

        int len = str.length();
        int cnt = 0;

        for(int i = len - 1; i >= 0; i--) {
            if(cnt >= a)
                break;
            System.out.print(str.charAt(i));
            cnt++;
        }
    }
}