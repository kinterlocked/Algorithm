import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double n = sc.nextLong();
		n = n / Math.PI;
		double r = Math.sqrt(n);
		double answer;
		
		answer = 2 * r * Math.PI;
		System.out.println(String.format("%.10f", answer));
		sc.close();
	}
}