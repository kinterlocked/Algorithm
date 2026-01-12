import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int r = sc.nextInt();
		int c = sc.nextInt();
		int n = sc.nextInt();
		long a, b;
		
		if(r % n != 0) {
			a = r / n + 1;
		}else {
			a = r / n;
		}
		
		if(c % n != 0) {
			b = c / n + 1;
		}else {
			b = c / n;
		}
		
		System.out.println(a * b);
		sc.close();
	}
}