import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		String[] a = new String[n];
		String[] b = new String[n];
		
		for(int i = 0; i < n; i++) {
			a[i] = sc.next();
		}
		
		for(int i = 0; i < n; i++) {
			b[i] = sc.next();
		}
		
		int count = 0;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				if(a[i].charAt(j) == b[i].charAt(j)) {
					count++;
				}
			}
		}
		System.out.println(count);
		sc.close();
	}
}
