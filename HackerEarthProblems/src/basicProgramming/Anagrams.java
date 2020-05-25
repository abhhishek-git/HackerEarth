package basicProgramming;

import java.util.Scanner;

public class Anagrams {
	public static int NUMBER_LETTER =26;
	
	private static int delta(int[] array1,  int[] array2) {
		int delta =0;
		for(int i=0; i<array1.length ;i++) {
			int difference = Math.abs(array1[i]-array2[i]);
			delta += difference;
		}
		return delta;
	}
	
	private static int[] getCharCounts(String s) {
		int[] charCount = new int[NUMBER_LETTER];
		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			int offset = (int)'a';
			int code = c - offset;
			charCount[code]++;
			
		}
		return charCount;
	}
	private static int numberNeeded(String first, String second) {
		int[] charCount1 = getCharCounts(first);
		int[] charCount2 = getCharCounts(second);
		
		return delta(charCount1, charCount2);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        for(int i=0 ; i< testCases; i++){
		String first = sc.next();
		String second = sc.next();
		System.out.println(numberNeeded(first, second));
        }
				
	}


}
