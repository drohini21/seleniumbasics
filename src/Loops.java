
public class Loops {
		// FOR loop
		int []a= {1,2,3,4,5};
	int i;
		 public void loop1()
	 {
	for (i=5;i<=12;i++)
	{
		System.out.println("Value of I ="+i);
	}
	 }
	public void testfor1()
	{
		for (int b:a)
		
		System.out.println("Value of A="+b);
	}
	
	
	
	
		public static void main(String[] args) {
		// TODO Auto-generated method stub

		Loops obj= new Loops();
		obj.loop1();
		obj.testfor1();
		 }
	
}
