import java.util.Scanner; 


public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int minVal = 0;
        int maxVal = 1000;

        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        } 

        for (int i = 1; i < 10; i++) {
            if (arr[i] < 500) {
                if (minVal < arr[i]) {
                    minVal = arr[i];
                }
            }
            if (arr[i] > 500) {
                if (maxVal > arr[i]) {
                    maxVal = arr[i];
                }
            }
        }
        System.out.print(minVal + " " + maxVal);
}
}