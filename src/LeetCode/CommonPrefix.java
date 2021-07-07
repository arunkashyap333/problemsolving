package LeetCode;

public class CommonPrefix {
	public static void main(String[] args) {
		CommonPrefix cp = new CommonPrefix();
		//		System.out.println(cp.comPre("Chandan", "Chan1"));
		String str[]= {"Chandan","chan","ch"};
		String output=cp.longestCommonPrefix(str);

		System.out.println(output);

	}
	public String longestCommonPrefix(String[] strs) {

		String temp=strs[0];

		for(int i=1;i<strs.length;i++) {
			temp=comPre(temp, strs[i]);
			
		}	

		return temp;        
	}



	String comPre(String x1,String x2) {
		String s = "";
		int len1=x1.length();
		int len2=x2.length();

		int len=len1<len2?len1:len2;

		for(int i=0;i<len;i++) {
			if(x1.charAt(i)!=x2.charAt(i)) {
				break;
			}
			s = s+x1.charAt(i);
		}

		return s;
	}

}
