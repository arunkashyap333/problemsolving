package HackersRank;

import java.util.Scanner;

public class parallelogram {
	
	static int B;
	static int H;
	static boolean flag = true;
	
	{
		System.out.println("Instance Block");
	}
	static {
		System.out.println("Static block");
		Scanner sc = new Scanner(System.in);
		
		B = sc.nextInt();
		H = sc.nextInt();
		if(B <= 0 || H <= 0) {
			sc.close();
			flag = false;
			System.out.println("java.lang.Exception: Breadth and height must be positive" );
		}
		
		sc.close();
		
	}
	public static void main(String[] args){
		System.out.println("Main");
		if(flag){
			int area=B*H;
			System.out.print(area+"\n");
		}
		parallelogram a = new parallelogram();
		parallelogram b = new parallelogram();

	}

}

//static block/instance block/jvm architecture
