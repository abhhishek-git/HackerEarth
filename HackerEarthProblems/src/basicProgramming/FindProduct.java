package basicProgramming;
//https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/find-product/submissions/

import java.util.Scanner;

//If we don't use the MOD, then result for large numbers is 0
public class FindProduct {
	static final int MOD = 10000007;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int[] arr = new int[input];
        for(int i=0; i<input; i++){
            arr[i] = sc.nextInt();
        }

        productOfArrayElements(arr);

    }
    public static void productOfArrayElements(int[] arr){
        Long result = Long.valueOf(1);
        for(int i=0; i<arr.length;i++){
        	// result *=arr[i] %MOD; -- this will not work
            result =(result *arr[i]) %MOD;
        }
        System.out.println(result);
   
	}
}
