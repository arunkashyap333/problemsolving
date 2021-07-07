package practice;

public class Vowel {
	
	public boolean check(char ch) {
		boolean flag;
		switch(ch) {
		case 'a':
			flag = true;
			break;
		case 'i':
			flag = true;
			break;
		case 'o':
			flag = true;
			break;
		case 'e':
			flag = true;
			break;
		case 'u':
			flag = true;
			break;
		default:
			flag = false;
			break;
		}
		return flag;
	}
	public static void main(String[] args) {
		
		Vowel obj2 = new Vowel();
		
//		char[] charArray = {'a','b','c','d','e','f','g','h','i',
//				'j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		String str = "ewbyeeeexwyaewtcrtrvyrwvtratry";
		char[] charArray = str.toCharArray();
		
		int count=0;
		for(int i=0;i<charArray.length;i++) {
		
			if (obj2.check(charArray[i])) {
				count++;
			}
		}
		
		System.out.println(count);
		
	}
	
}
