import java.util.Random;

public class GenRandomA3 {

	private int max;
	private int min;
	private int count;
	
	GenRandomA3(int a, int b, int c){
		
		min=a;
		max=b;
		count=c;
	}
	
	public void GenerateRandNumbers() {
		
		for(int i=0;i<count;i++) {
			
			Random r = new Random();
			System.out.print((r.nextInt((max-min)+1)+min)+"    ");
		}
	}
}
