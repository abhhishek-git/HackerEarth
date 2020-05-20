package basicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BasicInputOutput {
	public static void main(String[] args) throws IOException {
		
		//BufferedReader
		BufferedReader br = new  BufferedReader(new InputStreamReader(System.in));
		String name = br.readLine();
		System.out.println("Hi, "+ name);
		
		//Scanner
		Scanner sc = new Scanner(System.in);
		String name2 = sc.nextLine();
		System.out.println("Hi, "+ name2);
		
	}
}
