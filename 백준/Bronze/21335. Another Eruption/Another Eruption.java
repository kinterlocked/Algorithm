import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextDouble();
		a = a / Math.PI;
		a = Math.sqrt(a);
		
		System.out.println(a * 2 * Math.PI);
		sc.close();
	}
}