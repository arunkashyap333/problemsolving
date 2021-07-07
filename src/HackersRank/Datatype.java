package HackersRank;
import java.util.Scanner;

public class Datatype {

	public static void main(String []argh)
	{

		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();

		for(int i=0;i<t;i++)
		{

			try
			{
				long x=sc.nextLong();
				System.out.println(x+" can be fitted in:");
				if(x>= (-1)*givemeRange(8) && x< (givemeRange(8)))
					System.out.println("* byte\n* short\n* int\n* long");
				else if(x>= (-1)*givemeRange(16) && x<givemeRange(16))
					System.out.println("* short\n* int\n* long");
				else if(x>=(-1)*givemeRange(32) && x<givemeRange(32))
					System.out.println("* int\n* long");
				else 
					System.out.println("* long");
				//Complete the code
			}
			catch(Exception e)
			{
				System.out.println(sc.next()+" can't be fitted anywhere.");
			}

		}
		
	}
	static long givemeRange(int bits){
		return (long) Math.pow(2, bits-1);
}
}

