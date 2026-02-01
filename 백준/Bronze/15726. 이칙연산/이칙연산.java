import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		
		int total1 = (int) (a * b / c);
		int total2 = (int) (a / b * c);
		
		if(total1 > total2) {
			System.out.println(total1);
		}else {
			System.out.println(total2);
		}
		sc.close();
	}
}