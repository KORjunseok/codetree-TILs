import java.util.Scanner; 

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char[] arr = a.toCharArray();
        String b = sc.next();
        char[] brr = b.toCharArray();

        
        brr[0] = arr[0];
        brr[1] = arr[1];
        System.out.println(brr); 
    }
}