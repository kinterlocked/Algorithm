import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int o = sc.nextInt();
		int k = sc.nextInt();
		int x = n - o;
		int total = 0;
		
		if(o >= k) {
			total += k;
		}else {
			total += o;
		}
		
		if(x >= n - k) {
			total += n - k;
		}else {
			total += x;
		}
		
		System.out.println(total);
		sc.close();
	}
}