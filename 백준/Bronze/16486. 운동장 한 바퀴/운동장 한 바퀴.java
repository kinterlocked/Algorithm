import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int d1 = sc.nextInt();
		int d2 = sc.nextInt();
		double total = d1 * 2 + d2 * 2 * 3.141592;
		
		System.out.println(total);
		sc.close();
	}
}