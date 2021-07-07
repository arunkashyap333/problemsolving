package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//https://www.hackerrank.com/challenges/java-stdin-stdout/problem


public class InputOutput {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int i = 0;
		double d = 0;
		String s = null;

		try {
			i = Integer.parseInt(br.readLine());
			d = Double.parseDouble(br.readLine());
			s = br.readLine();
		}catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("String: " + s);
		System.out.println("Double: " + d);
		System.out.println("Int: " + i);
	}

}
