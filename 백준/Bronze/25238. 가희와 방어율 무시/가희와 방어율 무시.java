import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double rate = a - ((a / 100) * b);
		
		if(rate >= 100) {
			System.out.println("0");
		}else {
			System.out.println("1");
		}
		sc.close();
	}
}