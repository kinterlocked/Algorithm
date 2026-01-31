import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = a;
        int count = 0;

        while (true) {
            int left = b / 10;
            int right = b % 10;
            b = right * 10 + (left + right) % 10;
            count++;
            if (a == b) {
                break;
            }
        }
        System.out.println(count);
    }
}