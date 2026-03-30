import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		n = n / 2;
		m = m / 2;
		
		if(n < m) {
			System.out.println(n);
		}else {
			System.out.println(m);
		}
		sc.close();
	}
}