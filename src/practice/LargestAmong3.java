package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LargestAmong3 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		int num1 = Integer.valueOf(br.readLine());
		int num2 = Integer.valueOf(br.readLine());
		int num3 = Integer.valueOf(br.readLine());
		int largest;
//		if(num1>num2) {
//			//num1 num3
//			if(num1>num3) {
//				largest = num1;
//			}else {
//				largest = num3;
//			}
//		}else {
//			//num2 num3
//			if(num2>num3) {
//				largest = num2;
//			}else {
//				largest = num3;
//			}
//		}

		
		largest = num1>num2?num1>num3?num1:num3:num2>num3?num2:num3;
		System.out.println(largest);
		

	}

}
