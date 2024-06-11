import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
    Scanner sc = new Scanner(System.in);
    String a = sc.nextLine();
    int ai = a.length();

    char b = sc.next().charAt(0);
    int cnt = 0;

    for (int i = 0; i < ai; i++) {
        if (a.charAt(i) == b)
        cnt++;
    }
    System.out.print(cnt);
    }
}