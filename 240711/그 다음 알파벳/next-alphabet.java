import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);
        int b = (char) a + 1;
        if  (b == 122)
        b = 97;
        System.out.print((char)b);
        
    }
}