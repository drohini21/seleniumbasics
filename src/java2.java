
public class java2 {
	int i = 10;
	int j = 20;
	int k = 18;

	public void condition1() {

		if(i<j)
		{		
			System.out.println("i is less than j");
		}	
		/*else if(j>i) {
			System.out.println("j is greater than i");
		}*/
		else if(k>j /*&& k>i*/)
		{
	System.out.println("K is greatest");
		}
	}
	public static void main(String[] args) {
		java2 obj = new java2();
		obj.condition1();

	}
}
