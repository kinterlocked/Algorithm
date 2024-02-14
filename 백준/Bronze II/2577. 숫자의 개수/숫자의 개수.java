import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int sum = a * b * c;

		String str = String.valueOf(sum);
		char[] cArr = new char[str.length()];

		for (int i = 0; i < str.length(); i++) {
			cArr[i] = str.charAt(i);
		}
		int[] arr = new int[10];
		int count = 1;

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < cArr.length; j++) {
				if ((cArr[j] - '0') == i) {
					arr[i] += count;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}