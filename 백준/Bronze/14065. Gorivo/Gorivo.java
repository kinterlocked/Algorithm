import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextDouble();
		a = a * 1609.344;
		a = 100000 / a;
		a = a * 3.785411784;
		System.out.println(String.format("%.6f", a));
		sc.close();
	}
}