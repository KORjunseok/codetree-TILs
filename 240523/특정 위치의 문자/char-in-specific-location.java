import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
         char a = sc.next().charAt(0);

        char[] arr = new char[]{'L', 'E', 'B', 'R', 'O', 'S'};
        int cnt = -1;

        for (int i = 0; i < 5; i++) {
            if (arr[i] == a) {
                cnt = i;
            }
        }
        if (cnt == -1)
        System.out.print("None");
        else 
        System.out.print(cnt);

    }
}