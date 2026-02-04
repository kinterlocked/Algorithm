import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int y1 = sc.nextInt();
		int m1 = sc.nextInt();
		int d1 = sc.nextInt();
		int y2 = sc.nextInt();
		int m2 = sc.nextInt();
		int d2 = sc.nextInt();
		int a , b, c;
		
		b = y2 - y1 + 1;
		c = y2 - y1;
		
		if(m2 > m1) {
			a = y2 - y1;
		}else if(m1 == m2) {
			if(d2 >= d1) {
				a = y2 - y1;
			}else {
				a = y2 - y1 - 1;
			}
		}else {
			a = y2 - y1 - 1;
		}
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		sc.close();
	}
}