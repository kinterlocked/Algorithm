import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.StringTokenizer;


public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] arr = new int[10];
		LinkedList <Integer> list = new LinkedList<>();
		int sum = 0;
		int num = 42;
		
		for (int i = 0; i < 10; i++) {
			int a = Integer.parseInt(br.readLine());		
			arr[i] = a;			
		}

		for(int i = 0; i < arr.length; i++) {
			
			sum = arr[i] % num;
			boolean check = false;

            for (int value : list) {
                if (value == sum) {
                	check = true;
                    break;
                }
            }

            if (!check) {
                list.offer(sum);
            }
        }

        System.out.println(list.size());
    }
}