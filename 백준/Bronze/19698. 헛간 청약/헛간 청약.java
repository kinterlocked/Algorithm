import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();
		int l = sc.nextInt();
		int count;
		
		count = (w / l) * (h / l);
		
		if(count >= n) {
			System.out.println(n);
		}else {
			System.out.println(count);
		}
		sc.close();
	}
}
