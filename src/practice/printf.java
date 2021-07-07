package practice;

import java.util.Scanner;

public class printf {
	public static void main(String[] args){
		Scanner a = new Scanner(System.in);
		String s="";
		String num ="";
		for(int i=0;i<1;i++){

			s = a.next();
			num = a.next();
			for(int j=s.length();j<15;j++) {
				s+=" ";
			}
			for(int j=num.length();j<3;j++) {
				num="0"+num;
			}
			System.out.println(s+num);
        }
		a.close();
		
	}

}
