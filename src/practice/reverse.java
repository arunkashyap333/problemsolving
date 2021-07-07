package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class reverse {

	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = 0;
		try {
			num = Integer.valueOf(br.readLine());
		} catch (NumberFormatException | IOException e) {
			System.out.println("Enter Integer only");
		}
		int r = 0;
		int result = 0;
		while(num>0) {
			r=num%10;
			result=result*10+r;
			num=num/10;
			
		}
		System.out.println(result);

	}

}
