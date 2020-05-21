package basicProgramming;

import java.util.Scanner;

public class SeatingArrangement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numberOfInput = sc.nextInt();
		
		for(int i=0; i<numberOfInput ;i++) {
			int input = sc.nextInt();
			seating_arr(input);
		}
	}

	private static void seating_arr(int n) {
		String[] arr = {"WS","MS","AS","AS","MS","WS","WS","MS","AS","AS","MS","WS"};
		int div= n/12;
		int rem = n%12;
		
		if(rem==0) {
			div= div-1;
			int num = 12*div+1;
			System.out.println(num + " "+ arr[rem]);
		}else {
			rem = rem-1;
			int num = (12*div)+ (12-rem);
			System.out.println(num + " "+ arr[rem]);
		}
		
	}
}
