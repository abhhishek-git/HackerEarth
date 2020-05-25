package basicProgramming;

//https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/palindrome-check-2/submissions/
import java.util.Scanner;

public class PalindromicString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);;
		String inputString = sc.nextLine();
		isPalindromicString(inputString);
	}
	
	public static void isPalindromicString(String str) {
		int i=0;
		int j = str.length()-1;
		
		while(i<j) {
			if(str.charAt(i) != str.charAt(j)) {
				System.out.println("NO");
				return;
			}
			i++;
			j--;
		}
		System.out.println("YES");
	}
	
}
