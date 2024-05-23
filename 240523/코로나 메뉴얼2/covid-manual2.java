import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        // char a1 = sc.next().charAt(0);
        // int b1 = sc.nextInt();
        // char a2 = sc.next().charAt(0);
        // int b2 = sc.nextInt();
        // char a3 = sc.next().charAt(0);
        // int b3 = sc.nextInt();
        
        int[] arr = new int[3];
        char[] brr = new char[3];
        int[] cnt = new int[4];

        for (int i = 0; i < 3; i++) {
            brr[i] = sc.next().charAt(0);
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < 3; i++) {
            if (brr[i] == 'Y' && arr[i] >= 37)
            cnt[0]++;
            else if (brr[i] == 'N' && arr[i] >= 37)
            cnt[1]++;
            else if (brr[i] == 'Y' &&arr[i] < 37)
            cnt[2]++;
            else 
            cnt[3]++;
        }
        for (int i = 0; i <= 3; i++) {
            System.out.print(cnt[i] + " ");
        }
        if (cnt[0] == 2)
            System.out.print('E');
    }
}