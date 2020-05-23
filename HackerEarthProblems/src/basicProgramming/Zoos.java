package basicProgramming;

import java.util.Scanner;

public class Zoos {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		int count_z = 0;
		int count_o = 0;
		
		for(int i =0; i<name.length();i++) {
			if(name.charAt(i)=='z')
				count_z++;
			else
				count_o++;
		}
		if(2*count_z ==count_o) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
		char[] charArr = name.toCharArray();
	}
}
