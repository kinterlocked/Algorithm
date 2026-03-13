import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double n = sc.nextDouble();
		n = Math.sqrt(n);
		
		System.out.println(4 * n);
		sc.close();
	}
}