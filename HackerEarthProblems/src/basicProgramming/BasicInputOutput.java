package basicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BasicInputOutput {
	public static void main(String[] args) throws IOException {
		
		//BufferedReader
		BufferedReader br = new  BufferedReader(new InputStreamReader(System.in));
		String name = br.readLine();
		System.out.println("Hi, "+ name);
		
	}
}
