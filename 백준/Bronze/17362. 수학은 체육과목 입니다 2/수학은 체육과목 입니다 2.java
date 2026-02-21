import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		if((n - 1) % 8 == 0) {
			System.out.println("1");
		}else if((n - 5) % 8 == 0) {
			System.out.println("5");
		}else if((n - 3) % 4 == 0) {
			System.out.println("3");
		}else if((n - 2) % 8 == 0 || (n - 2) % 8 == 6) {
			System.out.println("2");
		}else {
			System.out.println("4");
		}
		sc.close();
	}
}