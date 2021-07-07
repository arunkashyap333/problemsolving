package HackersRank;

import java.util.Scanner;

public class OutputFormat {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("================================");
		for(int i=0;i<3;i++){
			String s1=sc.next();
			s1 = format(s1, 15, " ", false);
//			//make s1 to 15 char by appending spaces as suffix
//			for(int j=s1.length();j<15;j++) {
//				s1 = s1+" ";
//			}
			
			String num=sc.next();
			//make x to 3 char by adding prefix 0
//			for(int j=num.length();j<3;j++) {
//				num = "0"+num;
//			}
			num = format(num, 3, "0", true);
			System.out.println(s1+num);
		}
		System.out.println("================================");

	}
	
	static String format(String inp,int len,String pad, Boolean isPrefix) {
		//if prefix == true , add pad as prefix
		if(isPrefix) {
			for(int i=inp.length();i<len;i++) {
				inp = pad+inp;
			}
		}else {
			for(int i=inp.length();i<len;i++) {
				inp = inp+pad;
			}
		}
		//else add pad as suffix
		
		return inp;
		
	}
}