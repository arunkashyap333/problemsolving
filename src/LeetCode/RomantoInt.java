package LeetCode;

public class RomantoInt {

	public static void main(String[] args) {

		//		String str="MCMXCIV";
		String str = "LVIII";

		RomantoInt obj1=new RomantoInt();
		int inp=obj1.rti(str);
		System.out.println(inp);

	}

	int rti(String str) {

		int prev,curr,temp,res=0;
		temp = convert(str.charAt(str.length()-1));
		prev = temp;
		for(int i=str.length()-2;i>=0;i--) {
			curr = convert(str.charAt(i));
			if(curr < prev) {
				temp = temp - curr;
				prev = curr;
			}else {
				res = res + temp;
				temp = curr;
				prev = curr;
			}

		}
		res = res+temp;
		return res;
	}



	int convert(char c) {

		switch(c) {
		case 'I':
			return 1;
		case 'V':
			return 5;
		case 'X':
			return 10;
		case 'L':
			return 50;
		case 'C':
			return 100;
		case 'D':
			return 500;
		case 'M':
			return 1000;

		}
		return 0;
	}



}
