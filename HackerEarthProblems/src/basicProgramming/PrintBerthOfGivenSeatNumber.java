package basicProgramming;

import java.util.Scanner;

public class PrintBerthOfGivenSeatNumber {
	public static void main(String[] args) { }

	private static void berth_type(int s) {
		if((s%8) ==1 || s%8==4)
			System.out.println("lower birth");
		else if(s%8 ==2 || s%8==5)
			System.out.println("middle birth");
		else if(s%8 ==3 || s%8 ==6)
			System.out.println("upper birth");
		else if(s%8 ==7)
			System.out.println("Side lower");
		else
			System.out.println("Side upper");
		
	}
}
