import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int temp = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();    
        }
        Arrays.sort(arr);
        
        System.out.print(arr[n - 1] + " " + arr[n - 2]);
    }
}