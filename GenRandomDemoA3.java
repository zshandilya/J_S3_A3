import java.util.Scanner;

public class GenRandomDemoA3 {

	public static void main(String[] args) {

		GenRandomA3 obj;
		int min, max, count;
		Scanner s = new Scanner(System.in);
		char ans;
		
		do {
			
			System.out.println("***** GENERATE RANDOM NUMBERS IN RANGE(MIN - MAX) *****\n");
			do {
				System.out.print("Enter the min value(>=0): ");
				min=s.nextInt();
				if(min<0)
					System.out.println("min can't be negative. Please try again ...\n");
			} while(min<0);
			
			do {
				System.out.print("Enter the max value(>min): ");
				max=s.nextInt();
				if(max<min)
					System.out.println("max can't be lesser than or equal to min value. Please try again ...\n");
			} while(max<min);
			
			do {
				System.out.print("Enter the number of Random Numbers to be generated(>=0): ");
				count=s.nextInt();
				if(count<0)
					System.out.println("Can't be a negative value. Please try again ...\n");
			} while(count<0);
			
			obj=new GenRandomA3(min,max,count);
			obj.GenerateRandNumbers();
			
			System.out.print("\n\nDo you wish to retry (y/n): ");
			ans=s.next().toLowerCase().charAt(0);
			
		} while(ans=='y');
		
		s.close();
	}

}
