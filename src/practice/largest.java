package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class largest {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		int num1 = Integer.valueOf(br.readLine());
		int num2 = Integer.valueOf(br.readLine());
//		if(num1>num2)
//			System.out.println(num1);
//		else
//			System.out.println(num2);
//		
		int max = num1>num2?num1:num2;  //using Ternary operator
		System.out.println(max);
	}

}
