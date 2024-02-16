import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		
		double[] arr = new double[num];
		
		double max = 0;
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextDouble();
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		double sum = 0;
		for(int i = 0; i < arr.length; i++) {
			double grade;
			grade = (arr[i] / max) * 100;
			sum += grade;
		}
		
		System.out.println(sum/num);
	}
}