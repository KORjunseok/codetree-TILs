public class Main {
    public static void main(String[] args) {
        // 입력값이 주어지지 않았으므로 직접 숫자 4 사용
        int n = 4;

        // 윗부분 출력
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < (2 * n) - (2 * i) - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
        // 아랫부분 출력
        for (int i = 1; i < n; i++) {
            for (int j = n - i - 1; j > 0; j--) {
                System.out.print("  ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}