package basicProgramming;

import java.io.IOException;
import java.util.Scanner;

public class BasicInputOutput {
	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        String s = sc.next();
        System.out.println(i*2);
        System.out.println(s);
		
	}
}
